@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLifecyclePolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnLifecyclePolicyProps cfnLifecyclePolicyProps = CfnLifecyclePolicyProps.builder()
 * .executionRole("executionRole")
 * .name("name")
 * .policyDetails(List.of(PolicyDetailProperty.builder()
 * .action(ActionProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .includeResources(IncludeResourcesProperty.builder()
 * .amis(false)
 * .containers(false)
 * .snapshots(false)
 * .build())
 * .build())
 * .filter(FilterProperty.builder()
 * .type("type")
 * .value(123)
 * // the properties below are optional
 * .retainAtLeast(123)
 * .unit("unit")
 * .build())
 * // the properties below are optional
 * .exclusionRules(ExclusionRulesProperty.builder()
 * .amis(AmiExclusionRulesProperty.builder()
 * .isPublic(false)
 * .lastLaunched(LastLaunchedProperty.builder()
 * .unit("unit")
 * .value(123)
 * .build())
 * .regions(List.of("regions"))
 * .sharedAccounts(List.of("sharedAccounts"))
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build())
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build())
 * .build()))
 * .resourceSelection(ResourceSelectionProperty.builder()
 * .recipes(List.of(RecipeSelectionProperty.builder()
 * .name("name")
 * .semanticVersion("semanticVersion")
 * .build()))
 * .tagMap(Map.of(
 * "tagMapKey", "tagMap"))
 * .build())
 * .resourceType("resourceType")
 * // the properties below are optional
 * .description("description")
 * .status("status")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html)
 */
public interface CfnLifecyclePolicyProps {
  /**
   * Optional description for the lifecycle policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
   * access to run lifecycle actions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-executionrole)
   */
  public fun executionRole(): String

  /**
   * The name of the lifecycle policy to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-name)
   */
  public fun name(): String

  /**
   * Configuration details for the lifecycle policy rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
   */
  public fun policyDetails(): Any

  /**
   * Selection criteria for the resources that the lifecycle policy applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
   */
  public fun resourceSelection(): Any

  /**
   * The type of Image Builder resource that the lifecycle policy applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourcetype)
   */
  public fun resourceType(): String

  /**
   * Indicates whether the lifecycle policy resource is enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * Tags to apply to the lifecycle policy resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnLifecyclePolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Optional description for the lifecycle policy.
     */
    public fun description(description: String)

    /**
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to run lifecycle actions. 
     */
    public fun executionRole(executionRole: String)

    /**
     * @param name The name of the lifecycle policy to create. 
     */
    public fun name(name: String)

    /**
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    public fun policyDetails(policyDetails: IResolvable)

    /**
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    public fun policyDetails(policyDetails: List<Any>)

    /**
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    public fun policyDetails(vararg policyDetails: Any)

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    public fun resourceSelection(resourceSelection: IResolvable)

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    public fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty)

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07fa5f67810a0e9f95cef2d3a0b6d4f352c1ce3deafcc43245f1d0ee7d18ac56")
    public
        fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty.Builder.() -> Unit)

    /**
     * @param resourceType The type of Image Builder resource that the lifecycle policy applies to. 
     */
    public fun resourceType(resourceType: String)

    /**
     * @param status Indicates whether the lifecycle policy resource is enabled.
     */
    public fun status(status: String)

    /**
     * @param tags Tags to apply to the lifecycle policy resource.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps.builder()

    /**
     * @param description Optional description for the lifecycle policy.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to run lifecycle actions. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * @param name The name of the lifecycle policy to create. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    /**
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    override fun policyDetails(policyDetails: List<Any>) {
      cdkBuilder.policyDetails(policyDetails)
    }

    /**
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    override fun policyDetails(vararg policyDetails: Any): Unit =
        policyDetails(policyDetails.toList())

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    override fun resourceSelection(resourceSelection: IResolvable) {
      cdkBuilder.resourceSelection(resourceSelection.let(IResolvable::unwrap))
    }

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    override
        fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty) {
      cdkBuilder.resourceSelection(resourceSelection.let(CfnLifecyclePolicy.ResourceSelectionProperty::unwrap))
    }

    /**
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07fa5f67810a0e9f95cef2d3a0b6d4f352c1ce3deafcc43245f1d0ee7d18ac56")
    override
        fun resourceSelection(resourceSelection: CfnLifecyclePolicy.ResourceSelectionProperty.Builder.() -> Unit):
        Unit = resourceSelection(CfnLifecyclePolicy.ResourceSelectionProperty(resourceSelection))

    /**
     * @param resourceType The type of Image Builder resource that the lifecycle policy applies to. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * @param status Indicates whether the lifecycle policy resource is enabled.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags Tags to apply to the lifecycle policy resource.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps,
  ) : CdkObject(cdkObject), CfnLifecyclePolicyProps {
    /**
     * Optional description for the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to run lifecycle actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-executionrole)
     */
    override fun executionRole(): String = unwrap(this).getExecutionRole()

    /**
     * The name of the lifecycle policy to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Configuration details for the lifecycle policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
     */
    override fun policyDetails(): Any = unwrap(this).getPolicyDetails()

    /**
     * Selection criteria for the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
     */
    override fun resourceSelection(): Any = unwrap(this).getResourceSelection()

    /**
     * The type of Image Builder resource that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourcetype)
     */
    override fun resourceType(): String = unwrap(this).getResourceType()

    /**
     * Indicates whether the lifecycle policy resource is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * Tags to apply to the lifecycle policy resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLifecyclePolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps):
        CfnLifecyclePolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicyProps):
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicyProps
  }
}
