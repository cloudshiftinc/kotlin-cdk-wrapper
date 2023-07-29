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

package cloudshift.awscdk.dsl.services.ram

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ram.CfnPermissionProps

/**
 * Properties for defining a `CfnPermission`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ram.*;
 * Object policyTemplate;
 * CfnPermissionProps cfnPermissionProps = CfnPermissionProps.builder()
 * .name("name")
 * .policyTemplate(policyTemplate)
 * .resourceType("resourceType")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html)
 */
@CdkDslMarker
public class CfnPermissionPropsDsl {
    private val cdkBuilder: CfnPermissionProps.Builder = CfnPermissionProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param name Specifies the name of the customer managed permission. The name must be unique
     *   within the AWS Region .
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param policyTemplate A string in JSON format string that contains the following elements of
     *   a resource-based policy:.
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     *   list must contain only actions that are supported by the specified resource type. For a
     *   list of all actions supported by each resource type, see
     *   [Actions, resources, and condition keys for AWS services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     *   in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     *   user attempts an action for that action to be allowed. For more information about the
     *   Condition element, see
     *   [IAM policies: Condition element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     *   in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource
     * that you are sharing. The `Principal` comes from the list of identities added to the resource
     * share.
     */
    public fun policyTemplate(policyTemplate: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(policyTemplate)
        cdkBuilder.policyTemplate(builder.map)
    }

    /**
     * @param policyTemplate A string in JSON format string that contains the following elements of
     *   a resource-based policy:.
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     *   list must contain only actions that are supported by the specified resource type. For a
     *   list of all actions supported by each resource type, see
     *   [Actions, resources, and condition keys for AWS services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     *   in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     *   user attempts an action for that action to be allowed. For more information about the
     *   Condition element, see
     *   [IAM policies: Condition element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     *   in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource
     * that you are sharing. The `Principal` comes from the list of identities added to the resource
     * share.
     */
    public fun policyTemplate(policyTemplate: Any) {
        cdkBuilder.policyTemplate(policyTemplate)
    }

    /**
     * @param resourceType Specifies the name of the resource type that this customer managed
     *   permission applies to. The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and
     *   is not case sensitive. For example, to specify an Amazon EC2 Subnet, you can use the string
     *   `ec2:subnet` . To see the list of valid values for this parameter, query the
     *   [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
     *   operation.
     */
    public fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     *   permission.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     *   permission.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnPermissionProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
