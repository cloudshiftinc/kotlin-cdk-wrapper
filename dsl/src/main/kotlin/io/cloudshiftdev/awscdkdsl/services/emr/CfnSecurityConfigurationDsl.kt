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

package io.cloudshiftdev.awscdkdsl.services.emr

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnSecurityConfiguration
import software.constructs.Construct

/**
 * Use a `SecurityConfiguration` resource to configure data encryption, Kerberos authentication
 * (available in Amazon EMR release version 5.10.0 and later), and Amazon S3 authorization for EMRFS
 * (available in EMR 5.10.0 and later). You can re-use a security configuration for any number of
 * clusters in your account. For more information and example security configuration JSON objects,
 * see
 * [Create a Security Configuration](https://docs.aws.amazon.com//emr/latest/ManagementGuide/emr-create-security-configuration.html)
 * in the *Amazon EMR Management Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * Object securityConfiguration;
 * CfnSecurityConfiguration cfnSecurityConfiguration = CfnSecurityConfiguration.Builder.create(this,
 * "MyCfnSecurityConfiguration")
 * .securityConfiguration(securityConfiguration)
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSecurityConfiguration.Builder =
        CfnSecurityConfiguration.Builder.create(scope, id)

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
     *
     * @param name The name of the security configuration.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The security configuration details in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
     *
     * @param securityConfiguration The security configuration details in JSON format.
     */
    public fun securityConfiguration(securityConfiguration: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(securityConfiguration)
        cdkBuilder.securityConfiguration(builder.map)
    }

    /**
     * The security configuration details in JSON format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
     *
     * @param securityConfiguration The security configuration details in JSON format.
     */
    public fun securityConfiguration(securityConfiguration: Any) {
        cdkBuilder.securityConfiguration(securityConfiguration)
    }

    public fun build(): CfnSecurityConfiguration = cdkBuilder.build()
}
