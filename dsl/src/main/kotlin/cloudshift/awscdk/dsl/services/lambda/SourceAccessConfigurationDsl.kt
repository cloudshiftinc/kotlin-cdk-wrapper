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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.SourceAccessConfiguration
import software.amazon.awscdk.services.lambda.SourceAccessConfigurationType

/**
 * Specific settings like the authentication protocol or the VPC components to secure access to your
 * event source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * SourceAccessConfigurationType sourceAccessConfigurationType;
 * SourceAccessConfiguration sourceAccessConfiguration = SourceAccessConfiguration.builder()
 * .type(sourceAccessConfigurationType)
 * .uri("uri")
 * .build();
 * ```
 */
@CdkDslMarker
public class SourceAccessConfigurationDsl {
    private val cdkBuilder: SourceAccessConfiguration.Builder = SourceAccessConfiguration.builder()

    /**
     * @param type The type of authentication protocol or the VPC components for your event source.
     *   For example: "SASL_SCRAM_512_AUTH".
     */
    public fun type(type: SourceAccessConfigurationType) {
        cdkBuilder.type(type)
    }

    /**
     * @param uri The value for your chosen configuration in type. For example: "URI":
     *   "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName". The exact string
     *   depends on the type.
     */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    public fun build(): SourceAccessConfiguration = cdkBuilder.build()
}
