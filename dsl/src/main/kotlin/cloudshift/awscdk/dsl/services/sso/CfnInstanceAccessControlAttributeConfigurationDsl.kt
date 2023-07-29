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
import software.constructs.Construct

/**
 * Enables the attribute-based access control (ABAC) feature for the specified IAM Identity Center
 * instance.
 *
 * You can also specify new attributes to add to your ABAC configuration during the enabling
 * process. For more information about ABAC, see
 * [Attribute-Based Access Control](https://docs.aws.amazon.com//singlesignon/latest/userguide/abac.html)
 * in the *IAM Identity Center User Guide* .
 *
 * The `InstanceAccessControlAttributeConfiguration` property has been deprecated but is still
 * supported for backwards compatibility purposes. We recommend that you use the
 * `AccessControlAttributes` property instead.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sso.*;
 * CfnInstanceAccessControlAttributeConfiguration cfnInstanceAccessControlAttributeConfiguration =
 * CfnInstanceAccessControlAttributeConfiguration.Builder.create(this,
 * "MyCfnInstanceAccessControlAttributeConfiguration")
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
public class CfnInstanceAccessControlAttributeConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnInstanceAccessControlAttributeConfiguration.Builder =
        CfnInstanceAccessControlAttributeConfiguration.Builder.create(scope, id)

    private val _accessControlAttributes: MutableList<Any> = mutableListOf()

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     *
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     *   specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(vararg accessControlAttributes: Any) {
        _accessControlAttributes.addAll(listOf(*accessControlAttributes))
    }

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     *
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     *   specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(accessControlAttributes: Collection<Any>) {
        _accessControlAttributes.addAll(accessControlAttributes)
    }

    /**
     * Lists the attributes that are configured for ABAC in the specified IAM Identity Center
     * instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-accesscontrolattributes)
     *
     * @param accessControlAttributes Lists the attributes that are configured for ABAC in the
     *   specified IAM Identity Center instance.
     */
    public fun accessControlAttributes(accessControlAttributes: IResolvable) {
        cdkBuilder.accessControlAttributes(accessControlAttributes)
    }

    /**
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     *
     * @param instanceAccessControlAttributeConfiguration The
     *   InstanceAccessControlAttributeConfiguration property has been deprecated but is still
     *   supported for backwards compatibility purposes.
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
     * (deprecated) The InstanceAccessControlAttributeConfiguration property has been deprecated but
     * is still supported for backwards compatibility purposes.
     *
     * We recomend that you use AccessControlAttributes property instead.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instanceaccesscontrolattributeconfiguration)
     *
     * @param instanceAccessControlAttributeConfiguration The
     *   InstanceAccessControlAttributeConfiguration property has been deprecated but is still
     *   supported for backwards compatibility purposes.
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
     * The ARN of the IAM Identity Center instance under which the operation will be executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sso-instanceaccesscontrolattributeconfiguration.html#cfn-sso-instanceaccesscontrolattributeconfiguration-instancearn)
     *
     * @param instanceArn The ARN of the IAM Identity Center instance under which the operation will
     *   be executed.
     */
    public fun instanceArn(instanceArn: String) {
        cdkBuilder.instanceArn(instanceArn)
    }

    public fun build(): CfnInstanceAccessControlAttributeConfiguration {
        if (_accessControlAttributes.isNotEmpty())
            cdkBuilder.accessControlAttributes(_accessControlAttributes)
        return cdkBuilder.build()
    }
}
