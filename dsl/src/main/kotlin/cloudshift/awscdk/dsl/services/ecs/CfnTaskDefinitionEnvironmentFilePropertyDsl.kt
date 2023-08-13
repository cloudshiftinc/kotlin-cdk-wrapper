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
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * A list of files containing the environment variables to pass to a container.
 *
 * You can specify up to ten environment files. The file must have a `.env` file extension. Each
 * line in an environment file should contain an environment variable in `VARIABLE=VALUE` format.
 * Lines beginning with `#` are treated as comments and are ignored. For more information about the
 * environment variable file syntax, see
 * [Declare default environment variables in file](https://docs.aws.amazon.com/https://docs.docker.com/compose/env-file/)
 * .
 *
 * If there are environment variables specified using the `environment` parameter in a container
 * definition, they take precedence over the variables contained within an environment file. If
 * multiple environment files are specified that contain the same variable, they're processed from
 * the top down. We recommend that you use unique variable names. For more information, see
 * [Specifying environment variables](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/taskdef-envfiles.html)
 * in the *Amazon Elastic Container Service Developer Guide* .
 *
 * You must use the following platforms for the Fargate launch type:
 * * Linux platform version `1.4.0` or later.
 * * Windows platform version `1.0.0` or later.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * EnvironmentFileProperty environmentFileProperty = EnvironmentFileProperty.builder()
 * .type("type")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-environmentfile.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionEnvironmentFilePropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.EnvironmentFileProperty.Builder =
        CfnTaskDefinition.EnvironmentFileProperty.builder()

    /** @param type The file type to use. The only supported value is `s3` . */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param value The Amazon Resource Name (ARN) of the Amazon S3 object containing the
     *   environment variable file.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTaskDefinition.EnvironmentFileProperty = cdkBuilder.build()
}
