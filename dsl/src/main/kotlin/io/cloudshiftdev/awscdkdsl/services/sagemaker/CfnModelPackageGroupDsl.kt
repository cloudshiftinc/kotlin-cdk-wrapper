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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.sagemaker.CfnModelPackageGroup
import software.constructs.Construct

/**
 * A group of versioned models in the model registry.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * Object modelPackageGroupPolicy;
 * CfnModelPackageGroup cfnModelPackageGroup = CfnModelPackageGroup.Builder.create(this,
 * "MyCfnModelPackageGroup")
 * .modelPackageGroupName("modelPackageGroupName")
 * // the properties below are optional
 * .modelPackageGroupDescription("modelPackageGroupDescription")
 * .modelPackageGroupPolicy(modelPackageGroupPolicy)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html)
 */
@CdkDslMarker
public class CfnModelPackageGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnModelPackageGroup.Builder =
        CfnModelPackageGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The description for the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupdescription)
     *
     * @param modelPackageGroupDescription The description for the model group.
     */
    public fun modelPackageGroupDescription(modelPackageGroupDescription: String) {
        cdkBuilder.modelPackageGroupDescription(modelPackageGroupDescription)
    }

    /**
     * The name of the model group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegroupname)
     *
     * @param modelPackageGroupName The name of the model group.
     */
    public fun modelPackageGroupName(modelPackageGroupName: String) {
        cdkBuilder.modelPackageGroupName(modelPackageGroupName)
    }

    /**
     * A resouce policy to control access to a model group.
     *
     * For information about resoure policies, see
     * [Identity-based policies and resource-based policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
     * in the *AWS Identity and Access Management User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegrouppolicy)
     *
     * @param modelPackageGroupPolicy A resouce policy to control access to a model group.
     */
    public fun modelPackageGroupPolicy(modelPackageGroupPolicy: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(modelPackageGroupPolicy)
        cdkBuilder.modelPackageGroupPolicy(builder.map)
    }

    /**
     * A resouce policy to control access to a model group.
     *
     * For information about resoure policies, see
     * [Identity-based policies and resource-based policies](https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies_identity-vs-resource.html)
     * in the *AWS Identity and Access Management User Guide.* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-modelpackagegrouppolicy)
     *
     * @param modelPackageGroupPolicy A resouce policy to control access to a model group.
     */
    public fun modelPackageGroupPolicy(modelPackageGroupPolicy: Any) {
        cdkBuilder.modelPackageGroupPolicy(modelPackageGroupPolicy)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-modelpackagegroup.html#cfn-sagemaker-modelpackagegroup-tags)
     *
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnModelPackageGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
