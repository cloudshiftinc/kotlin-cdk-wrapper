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

package cloudshift.awscdk.dsl.services.sso

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfiguration
import software.amazon.awscdk.services.sso.CfnInstanceAccessControlAttributeConfigurationProps

/**
 * Properties for defining a `CfnInstanceAccessControlAttributeConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * CfnInstanceAccessControlAttributeConfigurationProps
 * cfnInstanceAccessControlAttributeConfigurationProps =
 * CfnInstanceAccessControlAttributeConfigurationProps.builder()
 * .instanceArn("instanceArn")
 * // the properties below are optional
 * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build()))
 * .instanceAccessControlAttributeConfiguration(InstanceAccessControlAttributeConfigurationProperty.builder()
 * .accessControlAttributes(List.of(AccessControlAttributeProperty.builder()
 * .key("key")
 * .value(AccessControlAttributeValueProperty.builder()
 * .source(List.of("source"))
 * .build())
 * .build()))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html)
 */
@CdkDslMarker
public class CfnInstanceAccessControlAttributeConfigurationPropsDsl {
    private val cdkBuilder: CfnInstanceAccessControlAttributeConfigurationProps.Builder =
        CfnInstanceAccessControlAttributeConfigurationProps.builder()

    private val _accessControlAttributes: MutableList<Any> = mutableListOf()

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     *   specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(vararg accessControlAttributes: Any) {
        _accessControlAttributes.addAll(listOf(*accessControlAttributes))
    }

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     *   specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(accessControlAttributes: Collection<Any>) {
        _accessControlAttributes.addAll(accessControlAttributes)
    }

    /**
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     *   specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(accessControlAttributes: IResolvable) {
        cdkBuilder.accessControlAttributes(accessControlAttributes)
    }

    /**
     * @param instanceAccessControlAttributeConfiguration The
     *   InstanceAccessControlAttributeConfiguration property has been deprecated but is still
     *   supported for backwards compatibility purposes. We recomend that you use
     *   AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instanceAccessControlAttributeConfiguration(
        instanceAccessControlAttributeConfiguration: IResolvable
    ) {
        cdkBuilder.instanceAccessControlAttributeConfiguration(
            instanceAccessControlAttributeConfiguration
        )
    }

    /**
     * @param instanceAccessControlAttributeConfiguration The
     *   InstanceAccessControlAttributeConfiguration property has been deprecated but is still
     *   supported for backwards compatibility purposes. We recomend that you use
     *   AccessControlAttributes property instead.
     * @deprecated this property has been deprecated
     */
    @Deprecated(message = "deprecated in CDK")
    public fun instanceAccessControlAttributeConfiguration(
        instanceAccessControlAttributeConfiguration:
            CfnInstanceAccessControlAttributeConfiguration.InstanceAccessControlAttributeConfigurationProperty
    ) {
        cdkBuilder.instanceAccessControlAttributeConfiguration(
            instanceAccessControlAttributeConfiguration
        )
    }

    /**
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     *   be executed.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun build(): CfnInstanceAccessControlAttributeConfigurationProps {
        if (_accessControlAttributes.isNotEmpty())
            cdkBuilder.accessControlAttributes(_accessControlAttributes)
        return cdkBuilder.build()
    }
}
