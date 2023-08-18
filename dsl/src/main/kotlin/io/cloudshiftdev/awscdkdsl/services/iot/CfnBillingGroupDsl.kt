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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnBillingGroup
import software.constructs.Construct

/**
 * Creates a new billing group.
 *
 * Requires permission to access the
 * [CreateBillingGroup](https://docs.aws.amazon.com//service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions)
 * action.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnBillingGroup cfnBillingGroup = CfnBillingGroup.Builder.create(this, "MyCfnBillingGroup")
 * .billingGroupName("billingGroupName")
 * .billingGroupProperties(BillingGroupPropertiesProperty.builder()
 * .billingGroupDescription("billingGroupDescription")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html)
 */
@CdkDslMarker
public class CfnBillingGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnBillingGroup.Builder = CfnBillingGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The name of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupname)
     *
     * @param billingGroupName The name of the billing group.
     */
    public fun billingGroupName(billingGroupName: String) {
        cdkBuilder.billingGroupName(billingGroupName)
    }

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     *
     * @param billingGroupProperties The properties of the billing group.
     */
    public fun billingGroupProperties(billingGroupProperties: IResolvable) {
        cdkBuilder.billingGroupProperties(billingGroupProperties)
    }

    /**
     * The properties of the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-billinggroupproperties)
     *
     * @param billingGroupProperties The properties of the billing group.
     */
    public fun billingGroupProperties(
        billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty
    ) {
        cdkBuilder.billingGroupProperties(billingGroupProperties)
    }

    /**
     * Metadata which can be used to manage the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
     *
     * @param tags Metadata which can be used to manage the billing group.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata which can be used to manage the billing group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html#cfn-iot-billinggroup-tags)
     *
     * @param tags Metadata which can be used to manage the billing group.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnBillingGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
