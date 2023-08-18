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

package io.cloudshiftdev.awscdkdsl.services.appstream

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appstream.CfnEntitlement
import software.constructs.Construct

/**
 * Creates an entitlement to control access, based on user attributes, to specific applications
 * within a stack.
 *
 * Entitlements apply to SAML 2.0 federated user identities. Amazon AppStream 2.0 user pool and
 * streaming URL users are entitled to all applications in a stack. Entitlements don't apply to the
 * desktop stream view application or to applications managed by a dynamic app provider using the
 * Dynamic Application Framework.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appstream.*;
 * CfnEntitlement cfnEntitlement = CfnEntitlement.Builder.create(this, "MyCfnEntitlement")
 * .appVisibility("appVisibility")
 * .attributes(List.of(AttributeProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .name("name")
 * .stackName("stackName")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html)
 */
@CdkDslMarker
public class CfnEntitlementDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEntitlement.Builder = CfnEntitlement.Builder.create(scope, id)

    private val _attributes: MutableList<Any> = mutableListOf()

    /**
     * Specifies whether to entitle all apps or only selected apps.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-appvisibility)
     *
     * @param appVisibility Specifies whether to entitle all apps or only selected apps.
     */
    public fun appVisibility(appVisibility: String) {
        cdkBuilder.appVisibility(appVisibility)
    }

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     *
     * @param attributes The attributes of the entitlement.
     */
    public fun attributes(vararg attributes: Any) {
        _attributes.addAll(listOf(*attributes))
    }

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     *
     * @param attributes The attributes of the entitlement.
     */
    public fun attributes(attributes: Collection<Any>) {
        _attributes.addAll(attributes)
    }

    /**
     * The attributes of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-attributes)
     *
     * @param attributes The attributes of the entitlement.
     */
    public fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes)
    }

    /**
     * The description of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-description)
     *
     * @param description The description of the entitlement.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The name of the entitlement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-name)
     *
     * @param name The name of the entitlement.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * The name of the stack.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-entitlement.html#cfn-appstream-entitlement-stackname)
     *
     * @param stackName The name of the stack.
     */
    public fun stackName(stackName: String) {
        cdkBuilder.stackName(stackName)
    }

    public fun build(): CfnEntitlement {
        if (_attributes.isNotEmpty()) cdkBuilder.attributes(_attributes)
        return cdkBuilder.build()
    }
}
