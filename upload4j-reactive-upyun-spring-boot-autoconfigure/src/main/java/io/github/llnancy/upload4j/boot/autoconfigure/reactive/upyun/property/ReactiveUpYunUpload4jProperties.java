package io.github.llnancy.upload4j.boot.autoconfigure.reactive.upyun.property;

import io.github.llnancy.upload4j.boot.autoconfigure.reactive.common.property.ReactiveCommonUpload4jProperties;
import io.github.llnancy.upload4j.impl.upyun.config.UpYunConfig;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * @author llnancy admin@lilu.org.cn
 * @since JDK17 2024/3/14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@ConfigurationProperties(prefix = "llnancy.upload4j")
public class ReactiveUpYunUpload4jProperties extends ReactiveCommonUpload4jProperties {

    @NestedConfigurationProperty
    private final UpYunConfig upYun = new UpYunConfig();
}
