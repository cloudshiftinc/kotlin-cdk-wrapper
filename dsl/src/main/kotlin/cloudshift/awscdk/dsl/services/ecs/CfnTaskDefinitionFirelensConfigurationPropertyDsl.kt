@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * The FireLens configuration for the container.
 *
 * This is used to specify and configure a log router for container logs. For more information, see
 * [Custom log routing](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/using_firelens.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * FirelensConfigurationProperty firelensConfigurationProperty =
 * FirelensConfigurationProperty.builder()
 * .options(Map.of(
 * "optionsKey", "options"))
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-firelensconfiguration.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionFirelensConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.FirelensConfigurationProperty.Builder =
        CfnTaskDefinition.FirelensConfigurationProperty.builder()

    /**
     * @param options The options to use when configuring the log router. This field is optional and
     *   can be used to add additional metadata, such as the task, task definition, cluster, and
     *   container instance details to the log event.
     *
     * If specified, valid option keys are:
     * * `enable-ecs-log-metadata` , which can be `true` or `false`
     * * `config-file-type` , which can be `s3` or `file`
     * * `config-file-value` , which is either an S3 ARN or a file path
     */
    public fun options(options: Map<String, String>) {
        cdkBuilder.options(options)
    }

    /**
     * @param options The options to use when configuring the log router. This field is optional and
     *   can be used to add additional metadata, such as the task, task definition, cluster, and
     *   container instance details to the log event.
     *
     * If specified, valid option keys are:
     * * `enable-ecs-log-metadata` , which can be `true` or `false`
     * * `config-file-type` , which can be `s3` or `file`
     * * `config-file-value` , which is either an S3 ARN or a file path
     */
    public fun options(options: IResolvable) {
        cdkBuilder.options(options)
    }

    /** @param type The log router to use. The valid values are `fluentd` or `fluentbit` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnTaskDefinition.FirelensConfigurationProperty = cdkBuilder.build()
}
