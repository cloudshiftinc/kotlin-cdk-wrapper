@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ram

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPermission`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ram.*;
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
public interface CfnPermissionProps {
  /**
   * Specifies the name of the customer managed permission.
   *
   * The name must be unique within the AWS Region .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-name)
   */
  public fun name(): String

  /**
   * A string in JSON format string that contains the following elements of a resource-based
   * policy:.
   *
   * * *Effect* : must be set to `ALLOW` .
   * * *Action* : specifies the actions that are allowed by this customer managed permission. The
   * list must contain only actions that are supported by the specified resource type. For a list of
   * all actions supported by each resource type, see [Actions, resources, and condition keys for AWS
   * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
   * in the *AWS Identity and Access Management User Guide* .
   * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
   * user attempts an action for that action to be allowed. For more information about the Condition
   * element, see [IAM policies: Condition
   * element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
   * in the *AWS Identity and Access Management User Guide* .
   *
   * This template can't include either the `Resource` or `Principal` elements. Those are both
   * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared using
   * this managed permission. The `Resource` comes from the ARN of the specific resource that you are
   * sharing. The `Principal` comes from the list of identities added to the resource share.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-policytemplate)
   */
  public fun policyTemplate(): Any

  /**
   * Specifies the name of the resource type that this customer managed permission applies to.
   *
   * The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and is not case sensitive. For
   * example, to specify an Amazon EC2 Subnet, you can use the string `ec2:subnet` . To see the list of
   * valid values for this parameter, query the
   * [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
   * operation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-resourcetype)
   */
  public fun resourceType(): String

  /**
   * Specifies a list of one or more tag key and value pairs to attach to the permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPermissionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name Specifies the name of the customer managed permission. 
     * The name must be unique within the AWS Region .
     */
    public fun name(name: String)

    /**
     * @param policyTemplate A string in JSON format string that contains the following elements of
     * a resource-based policy:. 
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     * list must contain only actions that are supported by the specified resource type. For a list of
     * all actions supported by each resource type, see [Actions, resources, and condition keys for AWS
     * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     * in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     * user attempts an action for that action to be allowed. For more information about the Condition
     * element, see [IAM policies: Condition
     * element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource that
     * you are sharing. The `Principal` comes from the list of identities added to the resource share.
     */
    public fun policyTemplate(policyTemplate: Any)

    /**
     * @param resourceType Specifies the name of the resource type that this customer managed
     * permission applies to. 
     * The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string `ec2:subnet` . To see the
     * list of valid values for this parameter, query the
     * [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
     * operation.
     */
    public fun resourceType(resourceType: String)

    /**
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ram.CfnPermissionProps.Builder =
        software.amazon.awscdk.services.ram.CfnPermissionProps.builder()

    /**
     * @param name Specifies the name of the customer managed permission. 
     * The name must be unique within the AWS Region .
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policyTemplate A string in JSON format string that contains the following elements of
     * a resource-based policy:. 
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     * list must contain only actions that are supported by the specified resource type. For a list of
     * all actions supported by each resource type, see [Actions, resources, and condition keys for AWS
     * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     * in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     * user attempts an action for that action to be allowed. For more information about the Condition
     * element, see [IAM policies: Condition
     * element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource that
     * you are sharing. The `Principal` comes from the list of identities added to the resource share.
     */
    override fun policyTemplate(policyTemplate: Any) {
      cdkBuilder.policyTemplate(policyTemplate)
    }

    /**
     * @param resourceType Specifies the name of the resource type that this customer managed
     * permission applies to. 
     * The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string `ec2:subnet` . To see the
     * list of valid values for this parameter, query the
     * [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
     * operation.
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies a list of one or more tag key and value pairs to attach to the
     * permission.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ram.CfnPermissionProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ram.CfnPermissionProps,
  ) : CdkObject(cdkObject), CfnPermissionProps {
    /**
     * Specifies the name of the customer managed permission.
     *
     * The name must be unique within the AWS Region .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * A string in JSON format string that contains the following elements of a resource-based
     * policy:.
     *
     * * *Effect* : must be set to `ALLOW` .
     * * *Action* : specifies the actions that are allowed by this customer managed permission. The
     * list must contain only actions that are supported by the specified resource type. For a list of
     * all actions supported by each resource type, see [Actions, resources, and condition keys for AWS
     * services](https://docs.aws.amazon.com/service-authorization/latest/reference/reference_policies_actions-resources-contextkeys.html)
     * in the *AWS Identity and Access Management User Guide* .
     * * *Condition* : (optional) specifies conditional parameters that must evaluate to true when a
     * user attempts an action for that action to be allowed. For more information about the Condition
     * element, see [IAM policies: Condition
     * element](https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements_condition.html)
     * in the *AWS Identity and Access Management User Guide* .
     *
     * This template can't include either the `Resource` or `Principal` elements. Those are both
     * filled in by AWS RAM when it instantiates the resource-based policy on each resource shared
     * using this managed permission. The `Resource` comes from the ARN of the specific resource that
     * you are sharing. The `Principal` comes from the list of identities added to the resource share.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-policytemplate)
     */
    override fun policyTemplate(): Any = unwrap(this).getPolicyTemplate()

    /**
     * Specifies the name of the resource type that this customer managed permission applies to.
     *
     * The format is `*&lt;service-code&gt;* : *&lt;resource-type&gt;*` and is not case sensitive.
     * For example, to specify an Amazon EC2 Subnet, you can use the string `ec2:subnet` . To see the
     * list of valid values for this parameter, query the
     * [ListResourceTypes](https://docs.aws.amazon.com/ram/latest/APIReference/API_ListResourceTypes.html)
     * operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-resourcetype)
     */
    override fun resourceType(): String = unwrap(this).getResourceType()

    /**
     * Specifies a list of one or more tag key and value pairs to attach to the permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ram-permission.html#cfn-ram-permission-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ram.CfnPermissionProps):
        CfnPermissionProps = CdkObjectWrappers.wrap(cdkObject) as CfnPermissionProps

    internal fun unwrap(wrapped: CfnPermissionProps):
        software.amazon.awscdk.services.ram.CfnPermissionProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ram.CfnPermissionProps
  }
}
