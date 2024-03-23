@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a lifecycle policy resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnLifecyclePolicy cfnLifecyclePolicy = CfnLifecyclePolicy.Builder.create(this,
 * "MyCfnLifecyclePolicy")
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
public open class CfnLifecyclePolicy(
  cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecyclePolicyProps,
  ) :
      this(software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnLifecyclePolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnLifecyclePolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnLifecyclePolicyProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the lifecycle policy resource.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Optional description for the lifecycle policy.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Optional description for the lifecycle policy.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
   * access to run lifecycle actions.
   */
  public open fun executionRole(): String = unwrap(this).getExecutionRole()

  /**
   * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
   * access to run lifecycle actions.
   */
  public open fun executionRole(`value`: String) {
    unwrap(this).setExecutionRole(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the lifecycle policy to create.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the lifecycle policy to create.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Configuration details for the lifecycle policy rules.
   */
  public open fun policyDetails(): Any = unwrap(this).getPolicyDetails()

  /**
   * Configuration details for the lifecycle policy rules.
   */
  public open fun policyDetails(`value`: IResolvable) {
    unwrap(this).setPolicyDetails(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration details for the lifecycle policy rules.
   */
  public open fun policyDetails(`value`: List<Any>) {
    unwrap(this).setPolicyDetails(`value`)
  }

  /**
   * Configuration details for the lifecycle policy rules.
   */
  public open fun policyDetails(vararg `value`: Any): Unit = policyDetails(`value`.toList())

  /**
   * Selection criteria for the resources that the lifecycle policy applies to.
   */
  public open fun resourceSelection(): Any = unwrap(this).getResourceSelection()

  /**
   * Selection criteria for the resources that the lifecycle policy applies to.
   */
  public open fun resourceSelection(`value`: IResolvable) {
    unwrap(this).setResourceSelection(`value`.let(IResolvable::unwrap))
  }

  /**
   * Selection criteria for the resources that the lifecycle policy applies to.
   */
  public open fun resourceSelection(`value`: ResourceSelectionProperty) {
    unwrap(this).setResourceSelection(`value`.let(ResourceSelectionProperty::unwrap))
  }

  /**
   * Selection criteria for the resources that the lifecycle policy applies to.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d03c4b2a83f72498d9e9cde2beb88da4f122dbcaa6e8a50bd80420abed9507b2")
  public open fun resourceSelection(`value`: ResourceSelectionProperty.Builder.() -> Unit): Unit =
      resourceSelection(ResourceSelectionProperty(`value`))

  /**
   * The type of Image Builder resource that the lifecycle policy applies to.
   */
  public open fun resourceType(): String = unwrap(this).getResourceType()

  /**
   * The type of Image Builder resource that the lifecycle policy applies to.
   */
  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  /**
   * Indicates whether the lifecycle policy resource is enabled.
   */
  public open fun status(): String? = unwrap(this).getStatus()

  /**
   * Indicates whether the lifecycle policy resource is enabled.
   */
  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  /**
   * Tags to apply to the lifecycle policy resource.
   */
  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * Tags to apply to the lifecycle policy resource.
   */
  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.imagebuilder.CfnLifecyclePolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional description for the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-description)
     * @param description Optional description for the lifecycle policy. 
     */
    public fun description(description: String)

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to run lifecycle actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-executionrole)
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to run lifecycle actions. 
     */
    public fun executionRole(executionRole: String)

    /**
     * The name of the lifecycle policy to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-name)
     * @param name The name of the lifecycle policy to create. 
     */
    public fun name(name: String)

    /**
     * Configuration details for the lifecycle policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    public fun policyDetails(policyDetails: IResolvable)

    /**
     * Configuration details for the lifecycle policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    public fun policyDetails(policyDetails: List<Any>)

    /**
     * Configuration details for the lifecycle policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    public fun policyDetails(vararg policyDetails: Any)

    /**
     * Selection criteria for the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    public fun resourceSelection(resourceSelection: IResolvable)

    /**
     * Selection criteria for the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    public fun resourceSelection(resourceSelection: ResourceSelectionProperty)

    /**
     * Selection criteria for the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b694048909f47d075362b9546c0a1899d67512c9b414b769fa22e7ad69d8b44")
    public fun resourceSelection(resourceSelection: ResourceSelectionProperty.Builder.() -> Unit)

    /**
     * The type of Image Builder resource that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourcetype)
     * @param resourceType The type of Image Builder resource that the lifecycle policy applies to. 
     */
    public fun resourceType(resourceType: String)

    /**
     * Indicates whether the lifecycle policy resource is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-status)
     * @param status Indicates whether the lifecycle policy resource is enabled. 
     */
    public fun status(status: String)

    /**
     * Tags to apply to the lifecycle policy resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-tags)
     * @param tags Tags to apply to the lifecycle policy resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.Builder
        = software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.Builder.create(scope, id)

    /**
     * Optional description for the lifecycle policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-description)
     * @param description Optional description for the lifecycle policy. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name or Amazon Resource Name (ARN) for the IAM role you create that grants Image Builder
     * access to run lifecycle actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-executionrole)
     * @param executionRole The name or Amazon Resource Name (ARN) for the IAM role you create that
     * grants Image Builder access to run lifecycle actions. 
     */
    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    /**
     * The name of the lifecycle policy to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-name)
     * @param name The name of the lifecycle policy to create. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Configuration details for the lifecycle policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    /**
     * Configuration details for the lifecycle policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    override fun policyDetails(policyDetails: List<Any>) {
      cdkBuilder.policyDetails(policyDetails)
    }

    /**
     * Configuration details for the lifecycle policy rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-policydetails)
     * @param policyDetails Configuration details for the lifecycle policy rules. 
     */
    override fun policyDetails(vararg policyDetails: Any): Unit =
        policyDetails(policyDetails.toList())

    /**
     * Selection criteria for the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    override fun resourceSelection(resourceSelection: IResolvable) {
      cdkBuilder.resourceSelection(resourceSelection.let(IResolvable::unwrap))
    }

    /**
     * Selection criteria for the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    override fun resourceSelection(resourceSelection: ResourceSelectionProperty) {
      cdkBuilder.resourceSelection(resourceSelection.let(ResourceSelectionProperty::unwrap))
    }

    /**
     * Selection criteria for the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourceselection)
     * @param resourceSelection Selection criteria for the resources that the lifecycle policy
     * applies to. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b694048909f47d075362b9546c0a1899d67512c9b414b769fa22e7ad69d8b44")
    override fun resourceSelection(resourceSelection: ResourceSelectionProperty.Builder.() -> Unit):
        Unit = resourceSelection(ResourceSelectionProperty(resourceSelection))

    /**
     * The type of Image Builder resource that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-resourcetype)
     * @param resourceType The type of Image Builder resource that the lifecycle policy applies to. 
     */
    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    /**
     * Indicates whether the lifecycle policy resource is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-status)
     * @param status Indicates whether the lifecycle policy resource is enabled. 
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * Tags to apply to the lifecycle policy resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-lifecyclepolicy.html#cfn-imagebuilder-lifecyclepolicy-tags)
     * @param tags Tags to apply to the lifecycle policy resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLifecyclePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLifecyclePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy):
        CfnLifecyclePolicy = CfnLifecyclePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicy):
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy
  }

  /**
   * Contains selection criteria for the lifecycle policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * ActionProperty actionProperty = ActionProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .includeResources(IncludeResourcesProperty.builder()
   * .amis(false)
   * .containers(false)
   * .snapshots(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-action.html)
   */
  public interface ActionProperty {
    /**
     * Specifies the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-action.html#cfn-imagebuilder-lifecyclepolicy-action-includeresources)
     */
    public fun includeResources(): Any? = unwrap(this).getIncludeResources()

    /**
     * Specifies the lifecycle action to take.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-action.html#cfn-imagebuilder-lifecyclepolicy-action-type)
     */
    public fun type(): String

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param includeResources Specifies the resources that the lifecycle policy applies to.
       */
      public fun includeResources(includeResources: IResolvable)

      /**
       * @param includeResources Specifies the resources that the lifecycle policy applies to.
       */
      public fun includeResources(includeResources: IncludeResourcesProperty)

      /**
       * @param includeResources Specifies the resources that the lifecycle policy applies to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad034d8d4102f123b01d990347b1e1b62631c0d661ae867d50bfd9934c31a4a")
      public fun includeResources(includeResources: IncludeResourcesProperty.Builder.() -> Unit)

      /**
       * @param type Specifies the lifecycle action to take. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty.builder()

      /**
       * @param includeResources Specifies the resources that the lifecycle policy applies to.
       */
      override fun includeResources(includeResources: IResolvable) {
        cdkBuilder.includeResources(includeResources.let(IResolvable::unwrap))
      }

      /**
       * @param includeResources Specifies the resources that the lifecycle policy applies to.
       */
      override fun includeResources(includeResources: IncludeResourcesProperty) {
        cdkBuilder.includeResources(includeResources.let(IncludeResourcesProperty::unwrap))
      }

      /**
       * @param includeResources Specifies the resources that the lifecycle policy applies to.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad034d8d4102f123b01d990347b1e1b62631c0d661ae867d50bfd9934c31a4a")
      override fun includeResources(includeResources: IncludeResourcesProperty.Builder.() -> Unit):
          Unit = includeResources(IncludeResourcesProperty(includeResources))

      /**
       * @param type Specifies the lifecycle action to take. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      /**
       * Specifies the resources that the lifecycle policy applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-action.html#cfn-imagebuilder-lifecyclepolicy-action-includeresources)
       */
      override fun includeResources(): Any? = unwrap(this).getIncludeResources()

      /**
       * Specifies the lifecycle action to take.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-action.html#cfn-imagebuilder-lifecyclepolicy-action-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty):
          ActionProperty = CdkObjectWrappers.wrap(cdkObject) as? ActionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty
    }
  }

  /**
   * Defines criteria for AMIs that are excluded from lifecycle actions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * AmiExclusionRulesProperty amiExclusionRulesProperty = AmiExclusionRulesProperty.builder()
   * .isPublic(false)
   * .lastLaunched(LastLaunchedProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build())
   * .regions(List.of("regions"))
   * .sharedAccounts(List.of("sharedAccounts"))
   * .tagMap(Map.of(
   * "tagMapKey", "tagMap"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html)
   */
  public interface AmiExclusionRulesProperty {
    /**
     * Configures whether public AMIs are excluded from the lifecycle action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-ispublic)
     */
    public fun isPublic(): Any? = unwrap(this).getIsPublic()

    /**
     * Specifies configuration details for Image Builder to exclude the most recent resources from
     * lifecycle actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-lastlaunched)
     */
    public fun lastLaunched(): Any? = unwrap(this).getLastLaunched()

    /**
     * Configures AWS Region s that are excluded from the lifecycle action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-regions)
     */
    public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    /**
     * Specifies AWS account s whose resources are excluded from the lifecycle action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-sharedaccounts)
     */
    public fun sharedAccounts(): List<String> = unwrap(this).getSharedAccounts() ?: emptyList()

    /**
     * Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-tagmap)
     */
    public fun tagMap(): Any? = unwrap(this).getTagMap()

    /**
     * A builder for [AmiExclusionRulesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param isPublic Configures whether public AMIs are excluded from the lifecycle action.
       */
      public fun isPublic(isPublic: Boolean)

      /**
       * @param isPublic Configures whether public AMIs are excluded from the lifecycle action.
       */
      public fun isPublic(isPublic: IResolvable)

      /**
       * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
       * recent resources from lifecycle actions.
       */
      public fun lastLaunched(lastLaunched: IResolvable)

      /**
       * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
       * recent resources from lifecycle actions.
       */
      public fun lastLaunched(lastLaunched: LastLaunchedProperty)

      /**
       * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
       * recent resources from lifecycle actions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88db98081f27153c3fd435b4d3401bbc9f02f63b4b3009e0d191966948c431eb")
      public fun lastLaunched(lastLaunched: LastLaunchedProperty.Builder.() -> Unit)

      /**
       * @param regions Configures AWS Region s that are excluded from the lifecycle action.
       */
      public fun regions(regions: List<String>)

      /**
       * @param regions Configures AWS Region s that are excluded from the lifecycle action.
       */
      public fun regions(vararg regions: String)

      /**
       * @param sharedAccounts Specifies AWS account s whose resources are excluded from the
       * lifecycle action.
       */
      public fun sharedAccounts(sharedAccounts: List<String>)

      /**
       * @param sharedAccounts Specifies AWS account s whose resources are excluded from the
       * lifecycle action.
       */
      public fun sharedAccounts(vararg sharedAccounts: String)

      /**
       * @param tagMap Lists tags that should be excluded from lifecycle actions for the AMIs that
       * have them.
       */
      public fun tagMap(tagMap: IResolvable)

      /**
       * @param tagMap Lists tags that should be excluded from lifecycle actions for the AMIs that
       * have them.
       */
      public fun tagMap(tagMap: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty.builder()

      /**
       * @param isPublic Configures whether public AMIs are excluded from the lifecycle action.
       */
      override fun isPublic(isPublic: Boolean) {
        cdkBuilder.isPublic(isPublic)
      }

      /**
       * @param isPublic Configures whether public AMIs are excluded from the lifecycle action.
       */
      override fun isPublic(isPublic: IResolvable) {
        cdkBuilder.isPublic(isPublic.let(IResolvable::unwrap))
      }

      /**
       * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
       * recent resources from lifecycle actions.
       */
      override fun lastLaunched(lastLaunched: IResolvable) {
        cdkBuilder.lastLaunched(lastLaunched.let(IResolvable::unwrap))
      }

      /**
       * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
       * recent resources from lifecycle actions.
       */
      override fun lastLaunched(lastLaunched: LastLaunchedProperty) {
        cdkBuilder.lastLaunched(lastLaunched.let(LastLaunchedProperty::unwrap))
      }

      /**
       * @param lastLaunched Specifies configuration details for Image Builder to exclude the most
       * recent resources from lifecycle actions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88db98081f27153c3fd435b4d3401bbc9f02f63b4b3009e0d191966948c431eb")
      override fun lastLaunched(lastLaunched: LastLaunchedProperty.Builder.() -> Unit): Unit =
          lastLaunched(LastLaunchedProperty(lastLaunched))

      /**
       * @param regions Configures AWS Region s that are excluded from the lifecycle action.
       */
      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      /**
       * @param regions Configures AWS Region s that are excluded from the lifecycle action.
       */
      override fun regions(vararg regions: String): Unit = regions(regions.toList())

      /**
       * @param sharedAccounts Specifies AWS account s whose resources are excluded from the
       * lifecycle action.
       */
      override fun sharedAccounts(sharedAccounts: List<String>) {
        cdkBuilder.sharedAccounts(sharedAccounts)
      }

      /**
       * @param sharedAccounts Specifies AWS account s whose resources are excluded from the
       * lifecycle action.
       */
      override fun sharedAccounts(vararg sharedAccounts: String): Unit =
          sharedAccounts(sharedAccounts.toList())

      /**
       * @param tagMap Lists tags that should be excluded from lifecycle actions for the AMIs that
       * have them.
       */
      override fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap.let(IResolvable::unwrap))
      }

      /**
       * @param tagMap Lists tags that should be excluded from lifecycle actions for the AMIs that
       * have them.
       */
      override fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty,
    ) : CdkObject(cdkObject), AmiExclusionRulesProperty {
      /**
       * Configures whether public AMIs are excluded from the lifecycle action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-ispublic)
       */
      override fun isPublic(): Any? = unwrap(this).getIsPublic()

      /**
       * Specifies configuration details for Image Builder to exclude the most recent resources from
       * lifecycle actions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-lastlaunched)
       */
      override fun lastLaunched(): Any? = unwrap(this).getLastLaunched()

      /**
       * Configures AWS Region s that are excluded from the lifecycle action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-regions)
       */
      override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

      /**
       * Specifies AWS account s whose resources are excluded from the lifecycle action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-sharedaccounts)
       */
      override fun sharedAccounts(): List<String> = unwrap(this).getSharedAccounts() ?: emptyList()

      /**
       * Lists tags that should be excluded from lifecycle actions for the AMIs that have them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-amiexclusionrules.html#cfn-imagebuilder-lifecyclepolicy-amiexclusionrules-tagmap)
       */
      override fun tagMap(): Any? = unwrap(this).getTagMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AmiExclusionRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty):
          AmiExclusionRulesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AmiExclusionRulesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmiExclusionRulesProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty
    }
  }

  /**
   * Specifies resources that lifecycle policy actions should not apply to.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * ExclusionRulesProperty exclusionRulesProperty = ExclusionRulesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-exclusionrules.html)
   */
  public interface ExclusionRulesProperty {
    /**
     * Lists configuration values that apply to AMIs that Image Builder should exclude from the
     * lifecycle action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-exclusionrules.html#cfn-imagebuilder-lifecyclepolicy-exclusionrules-amis)
     */
    public fun amis(): Any? = unwrap(this).getAmis()

    /**
     * Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder
     * image resources that have them.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-exclusionrules.html#cfn-imagebuilder-lifecyclepolicy-exclusionrules-tagmap)
     */
    public fun tagMap(): Any? = unwrap(this).getTagMap()

    /**
     * A builder for [ExclusionRulesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
       * from the lifecycle action.
       */
      public fun amis(amis: IResolvable)

      /**
       * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
       * from the lifecycle action.
       */
      public fun amis(amis: AmiExclusionRulesProperty)

      /**
       * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
       * from the lifecycle action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2122b0a58ad15c1af0fb85f28b31361f85dd23377995c8c5ea473b2a188a9de")
      public fun amis(amis: AmiExclusionRulesProperty.Builder.() -> Unit)

      /**
       * @param tagMap Contains a list of tags that Image Builder uses to skip lifecycle actions for
       * Image Builder image resources that have them.
       */
      public fun tagMap(tagMap: IResolvable)

      /**
       * @param tagMap Contains a list of tags that Image Builder uses to skip lifecycle actions for
       * Image Builder image resources that have them.
       */
      public fun tagMap(tagMap: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty.builder()

      /**
       * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
       * from the lifecycle action.
       */
      override fun amis(amis: IResolvable) {
        cdkBuilder.amis(amis.let(IResolvable::unwrap))
      }

      /**
       * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
       * from the lifecycle action.
       */
      override fun amis(amis: AmiExclusionRulesProperty) {
        cdkBuilder.amis(amis.let(AmiExclusionRulesProperty::unwrap))
      }

      /**
       * @param amis Lists configuration values that apply to AMIs that Image Builder should exclude
       * from the lifecycle action.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2122b0a58ad15c1af0fb85f28b31361f85dd23377995c8c5ea473b2a188a9de")
      override fun amis(amis: AmiExclusionRulesProperty.Builder.() -> Unit): Unit =
          amis(AmiExclusionRulesProperty(amis))

      /**
       * @param tagMap Contains a list of tags that Image Builder uses to skip lifecycle actions for
       * Image Builder image resources that have them.
       */
      override fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap.let(IResolvable::unwrap))
      }

      /**
       * @param tagMap Contains a list of tags that Image Builder uses to skip lifecycle actions for
       * Image Builder image resources that have them.
       */
      override fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty,
    ) : CdkObject(cdkObject), ExclusionRulesProperty {
      /**
       * Lists configuration values that apply to AMIs that Image Builder should exclude from the
       * lifecycle action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-exclusionrules.html#cfn-imagebuilder-lifecyclepolicy-exclusionrules-amis)
       */
      override fun amis(): Any? = unwrap(this).getAmis()

      /**
       * Contains a list of tags that Image Builder uses to skip lifecycle actions for Image Builder
       * image resources that have them.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-exclusionrules.html#cfn-imagebuilder-lifecyclepolicy-exclusionrules-tagmap)
       */
      override fun tagMap(): Any? = unwrap(this).getTagMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty):
          ExclusionRulesProperty = CdkObjectWrappers.wrap(cdkObject) as? ExclusionRulesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionRulesProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty
    }
  }

  /**
   * Defines filters that the lifecycle policy uses to determine impacted resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .type("type")
   * .value(123)
   * // the properties below are optional
   * .retainAtLeast(123)
   * .unit("unit")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html)
   */
  public interface FilterProperty {
    /**
     * For age-based filters, this is the number of resources to keep on hand after the lifecycle
     * `DELETE` action is applied.
     *
     * Impacted resources are only deleted if you have more than this number of resources. If you
     * have fewer resources than this number, the impacted resource is not deleted.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-retainatleast)
     */
    public fun retainAtLeast(): Number? = unwrap(this).getRetainAtLeast()

    /**
     * Filter resources based on either `age` or `count` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-type)
     */
    public fun type(): String

    /**
     * Defines the unit of time that the lifecycle policy uses to determine impacted resources.
     *
     * This is required for age-based rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-unit)
     */
    public fun unit(): String? = unwrap(this).getUnit()

    /**
     * The number of units for the time period or for the count.
     *
     * For example, a value of `6` might refer to six months or six AMIs.
     *
     *
     * For count-based filters, this value represents the minimum number of resources to keep on
     * hand. If you have fewer resources than this number, the resource is excluded from lifecycle
     * actions.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param retainAtLeast For age-based filters, this is the number of resources to keep on hand
       * after the lifecycle `DELETE` action is applied.
       * Impacted resources are only deleted if you have more than this number of resources. If you
       * have fewer resources than this number, the impacted resource is not deleted.
       */
      public fun retainAtLeast(retainAtLeast: Number)

      /**
       * @param type Filter resources based on either `age` or `count` . 
       */
      public fun type(type: String)

      /**
       * @param unit Defines the unit of time that the lifecycle policy uses to determine impacted
       * resources.
       * This is required for age-based rules.
       */
      public fun unit(unit: String)

      /**
       * @param value The number of units for the time period or for the count. 
       * For example, a value of `6` might refer to six months or six AMIs.
       *
       *
       * For count-based filters, this value represents the minimum number of resources to keep on
       * hand. If you have fewer resources than this number, the resource is excluded from lifecycle
       * actions.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty.builder()

      /**
       * @param retainAtLeast For age-based filters, this is the number of resources to keep on hand
       * after the lifecycle `DELETE` action is applied.
       * Impacted resources are only deleted if you have more than this number of resources. If you
       * have fewer resources than this number, the impacted resource is not deleted.
       */
      override fun retainAtLeast(retainAtLeast: Number) {
        cdkBuilder.retainAtLeast(retainAtLeast)
      }

      /**
       * @param type Filter resources based on either `age` or `count` . 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param unit Defines the unit of time that the lifecycle policy uses to determine impacted
       * resources.
       * This is required for age-based rules.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The number of units for the time period or for the count. 
       * For example, a value of `6` might refer to six months or six AMIs.
       *
       *
       * For count-based filters, this value represents the minimum number of resources to keep on
       * hand. If you have fewer resources than this number, the resource is excluded from lifecycle
       * actions.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * For age-based filters, this is the number of resources to keep on hand after the lifecycle
       * `DELETE` action is applied.
       *
       * Impacted resources are only deleted if you have more than this number of resources. If you
       * have fewer resources than this number, the impacted resource is not deleted.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-retainatleast)
       */
      override fun retainAtLeast(): Number? = unwrap(this).getRetainAtLeast()

      /**
       * Filter resources based on either `age` or `count` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Defines the unit of time that the lifecycle policy uses to determine impacted resources.
       *
       * This is required for age-based rules.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-unit)
       */
      override fun unit(): String? = unwrap(this).getUnit()

      /**
       * The number of units for the time period or for the count.
       *
       * For example, a value of `6` might refer to six months or six AMIs.
       *
       *
       * For count-based filters, this value represents the minimum number of resources to keep on
       * hand. If you have fewer resources than this number, the resource is excluded from lifecycle
       * actions.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-filter.html#cfn-imagebuilder-lifecyclepolicy-filter-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty):
          FilterProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty
    }
  }

  /**
   * Specifies how the lifecycle policy should apply actions to selected resources.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * IncludeResourcesProperty includeResourcesProperty = IncludeResourcesProperty.builder()
   * .amis(false)
   * .containers(false)
   * .snapshots(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html)
   */
  public interface IncludeResourcesProperty {
    /**
     * Specifies whether the lifecycle action should apply to distributed AMIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html#cfn-imagebuilder-lifecyclepolicy-includeresources-amis)
     */
    public fun amis(): Any? = unwrap(this).getAmis()

    /**
     * Specifies whether the lifecycle action should apply to distributed containers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html#cfn-imagebuilder-lifecyclepolicy-includeresources-containers)
     */
    public fun containers(): Any? = unwrap(this).getContainers()

    /**
     * Specifies whether the lifecycle action should apply to snapshots associated with distributed
     * AMIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html#cfn-imagebuilder-lifecyclepolicy-includeresources-snapshots)
     */
    public fun snapshots(): Any? = unwrap(this).getSnapshots()

    /**
     * A builder for [IncludeResourcesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amis Specifies whether the lifecycle action should apply to distributed AMIs.
       */
      public fun amis(amis: Boolean)

      /**
       * @param amis Specifies whether the lifecycle action should apply to distributed AMIs.
       */
      public fun amis(amis: IResolvable)

      /**
       * @param containers Specifies whether the lifecycle action should apply to distributed
       * containers.
       */
      public fun containers(containers: Boolean)

      /**
       * @param containers Specifies whether the lifecycle action should apply to distributed
       * containers.
       */
      public fun containers(containers: IResolvable)

      /**
       * @param snapshots Specifies whether the lifecycle action should apply to snapshots
       * associated with distributed AMIs.
       */
      public fun snapshots(snapshots: Boolean)

      /**
       * @param snapshots Specifies whether the lifecycle action should apply to snapshots
       * associated with distributed AMIs.
       */
      public fun snapshots(snapshots: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty.builder()

      /**
       * @param amis Specifies whether the lifecycle action should apply to distributed AMIs.
       */
      override fun amis(amis: Boolean) {
        cdkBuilder.amis(amis)
      }

      /**
       * @param amis Specifies whether the lifecycle action should apply to distributed AMIs.
       */
      override fun amis(amis: IResolvable) {
        cdkBuilder.amis(amis.let(IResolvable::unwrap))
      }

      /**
       * @param containers Specifies whether the lifecycle action should apply to distributed
       * containers.
       */
      override fun containers(containers: Boolean) {
        cdkBuilder.containers(containers)
      }

      /**
       * @param containers Specifies whether the lifecycle action should apply to distributed
       * containers.
       */
      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      /**
       * @param snapshots Specifies whether the lifecycle action should apply to snapshots
       * associated with distributed AMIs.
       */
      override fun snapshots(snapshots: Boolean) {
        cdkBuilder.snapshots(snapshots)
      }

      /**
       * @param snapshots Specifies whether the lifecycle action should apply to snapshots
       * associated with distributed AMIs.
       */
      override fun snapshots(snapshots: IResolvable) {
        cdkBuilder.snapshots(snapshots.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty,
    ) : CdkObject(cdkObject), IncludeResourcesProperty {
      /**
       * Specifies whether the lifecycle action should apply to distributed AMIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html#cfn-imagebuilder-lifecyclepolicy-includeresources-amis)
       */
      override fun amis(): Any? = unwrap(this).getAmis()

      /**
       * Specifies whether the lifecycle action should apply to distributed containers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html#cfn-imagebuilder-lifecyclepolicy-includeresources-containers)
       */
      override fun containers(): Any? = unwrap(this).getContainers()

      /**
       * Specifies whether the lifecycle action should apply to snapshots associated with
       * distributed AMIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-includeresources.html#cfn-imagebuilder-lifecyclepolicy-includeresources-snapshots)
       */
      override fun snapshots(): Any? = unwrap(this).getSnapshots()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncludeResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty):
          IncludeResourcesProperty = CdkObjectWrappers.wrap(cdkObject) as? IncludeResourcesProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncludeResourcesProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty
    }
  }

  /**
   * Defines criteria to exclude AMIs from lifecycle actions based on the last time they were used
   * to launch an instance.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * LastLaunchedProperty lastLaunchedProperty = LastLaunchedProperty.builder()
   * .unit("unit")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-lastlaunched.html)
   */
  public interface LastLaunchedProperty {
    /**
     * Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the
     * last instance launched from the AMI.
     *
     * For example: days, weeks, months, or years.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-lastlaunched.html#cfn-imagebuilder-lifecyclepolicy-lastlaunched-unit)
     */
    public fun unit(): String

    /**
     * The integer number of units for the time period.
     *
     * For example `6` (months).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-lastlaunched.html#cfn-imagebuilder-lifecyclepolicy-lastlaunched-value)
     */
    public fun `value`(): Number

    /**
     * A builder for [LastLaunchedProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unit Defines the unit of time that the lifecycle policy uses to calculate elapsed
       * time since the last instance launched from the AMI. 
       * For example: days, weeks, months, or years.
       */
      public fun unit(unit: String)

      /**
       * @param value The integer number of units for the time period. 
       * For example `6` (months).
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty.builder()

      /**
       * @param unit Defines the unit of time that the lifecycle policy uses to calculate elapsed
       * time since the last instance launched from the AMI. 
       * For example: days, weeks, months, or years.
       */
      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      /**
       * @param value The integer number of units for the time period. 
       * For example `6` (months).
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty,
    ) : CdkObject(cdkObject), LastLaunchedProperty {
      /**
       * Defines the unit of time that the lifecycle policy uses to calculate elapsed time since the
       * last instance launched from the AMI.
       *
       * For example: days, weeks, months, or years.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-lastlaunched.html#cfn-imagebuilder-lifecyclepolicy-lastlaunched-unit)
       */
      override fun unit(): String = unwrap(this).getUnit()

      /**
       * The integer number of units for the time period.
       *
       * For example `6` (months).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-lastlaunched.html#cfn-imagebuilder-lifecyclepolicy-lastlaunched-value)
       */
      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LastLaunchedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty):
          LastLaunchedProperty = CdkObjectWrappers.wrap(cdkObject) as? LastLaunchedProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LastLaunchedProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty
    }
  }

  /**
   * The configuration details for a lifecycle policy resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * PolicyDetailProperty policyDetailProperty = PolicyDetailProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html)
   */
  public interface PolicyDetailProperty {
    /**
     * Configuration details for the policy action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html#cfn-imagebuilder-lifecyclepolicy-policydetail-action)
     */
    public fun action(): Any

    /**
     * Additional rules to specify resources that should be exempt from policy actions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html#cfn-imagebuilder-lifecyclepolicy-policydetail-exclusionrules)
     */
    public fun exclusionRules(): Any? = unwrap(this).getExclusionRules()

    /**
     * Specifies the resources that the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html#cfn-imagebuilder-lifecyclepolicy-policydetail-filter)
     */
    public fun filter(): Any

    /**
     * A builder for [PolicyDetailProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action Configuration details for the policy action. 
       */
      public fun action(action: IResolvable)

      /**
       * @param action Configuration details for the policy action. 
       */
      public fun action(action: ActionProperty)

      /**
       * @param action Configuration details for the policy action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9dbb42e008c2d9f934812afdd7d0401f3db973cb54b7172a6deac66ce238c17")
      public fun action(action: ActionProperty.Builder.() -> Unit)

      /**
       * @param exclusionRules Additional rules to specify resources that should be exempt from
       * policy actions.
       */
      public fun exclusionRules(exclusionRules: IResolvable)

      /**
       * @param exclusionRules Additional rules to specify resources that should be exempt from
       * policy actions.
       */
      public fun exclusionRules(exclusionRules: ExclusionRulesProperty)

      /**
       * @param exclusionRules Additional rules to specify resources that should be exempt from
       * policy actions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2aefbdee6810949a08fbc3ec96996e7ff8320d4c8ad322f84ce069c822106be")
      public fun exclusionRules(exclusionRules: ExclusionRulesProperty.Builder.() -> Unit)

      /**
       * @param filter Specifies the resources that the lifecycle policy applies to. 
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter Specifies the resources that the lifecycle policy applies to. 
       */
      public fun filter(filter: FilterProperty)

      /**
       * @param filter Specifies the resources that the lifecycle policy applies to. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e93a5d8726b320824ecbcb01841580b080f8860aa78ed0736beb59b4dc81ec")
      public fun filter(filter: FilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty.builder()

      /**
       * @param action Configuration details for the policy action. 
       */
      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      /**
       * @param action Configuration details for the policy action. 
       */
      override fun action(action: ActionProperty) {
        cdkBuilder.action(action.let(ActionProperty::unwrap))
      }

      /**
       * @param action Configuration details for the policy action. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9dbb42e008c2d9f934812afdd7d0401f3db973cb54b7172a6deac66ce238c17")
      override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
          action(ActionProperty(action))

      /**
       * @param exclusionRules Additional rules to specify resources that should be exempt from
       * policy actions.
       */
      override fun exclusionRules(exclusionRules: IResolvable) {
        cdkBuilder.exclusionRules(exclusionRules.let(IResolvable::unwrap))
      }

      /**
       * @param exclusionRules Additional rules to specify resources that should be exempt from
       * policy actions.
       */
      override fun exclusionRules(exclusionRules: ExclusionRulesProperty) {
        cdkBuilder.exclusionRules(exclusionRules.let(ExclusionRulesProperty::unwrap))
      }

      /**
       * @param exclusionRules Additional rules to specify resources that should be exempt from
       * policy actions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2aefbdee6810949a08fbc3ec96996e7ff8320d4c8ad322f84ce069c822106be")
      override fun exclusionRules(exclusionRules: ExclusionRulesProperty.Builder.() -> Unit): Unit =
          exclusionRules(ExclusionRulesProperty(exclusionRules))

      /**
       * @param filter Specifies the resources that the lifecycle policy applies to. 
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      /**
       * @param filter Specifies the resources that the lifecycle policy applies to. 
       */
      override fun filter(filter: FilterProperty) {
        cdkBuilder.filter(filter.let(FilterProperty::unwrap))
      }

      /**
       * @param filter Specifies the resources that the lifecycle policy applies to. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e93a5d8726b320824ecbcb01841580b080f8860aa78ed0736beb59b4dc81ec")
      override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
          filter(FilterProperty(filter))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty,
    ) : CdkObject(cdkObject), PolicyDetailProperty {
      /**
       * Configuration details for the policy action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html#cfn-imagebuilder-lifecyclepolicy-policydetail-action)
       */
      override fun action(): Any = unwrap(this).getAction()

      /**
       * Additional rules to specify resources that should be exempt from policy actions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html#cfn-imagebuilder-lifecyclepolicy-policydetail-exclusionrules)
       */
      override fun exclusionRules(): Any? = unwrap(this).getExclusionRules()

      /**
       * Specifies the resources that the lifecycle policy applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-policydetail.html#cfn-imagebuilder-lifecyclepolicy-policydetail-filter)
       */
      override fun filter(): Any = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty):
          PolicyDetailProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyDetailProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyDetailProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty
    }
  }

  /**
   * Specifies an Image Builder recipe that the lifecycle policy uses for resource selection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * RecipeSelectionProperty recipeSelectionProperty = RecipeSelectionProperty.builder()
   * .name("name")
   * .semanticVersion("semanticVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-recipeselection.html)
   */
  public interface RecipeSelectionProperty {
    /**
     * The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-recipeselection.html#cfn-imagebuilder-lifecyclepolicy-recipeselection-name)
     */
    public fun name(): String

    /**
     * The version of the Image Builder recipe specified by the `name` field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-recipeselection.html#cfn-imagebuilder-lifecyclepolicy-recipeselection-semanticversion)
     */
    public fun semanticVersion(): String

    /**
     * A builder for [RecipeSelectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param name The name of an Image Builder recipe that the lifecycle policy uses for resource
       * selection. 
       */
      public fun name(name: String)

      /**
       * @param semanticVersion The version of the Image Builder recipe specified by the `name`
       * field. 
       */
      public fun semanticVersion(semanticVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty.builder()

      /**
       * @param name The name of an Image Builder recipe that the lifecycle policy uses for resource
       * selection. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param semanticVersion The version of the Image Builder recipe specified by the `name`
       * field. 
       */
      override fun semanticVersion(semanticVersion: String) {
        cdkBuilder.semanticVersion(semanticVersion)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty,
    ) : CdkObject(cdkObject), RecipeSelectionProperty {
      /**
       * The name of an Image Builder recipe that the lifecycle policy uses for resource selection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-recipeselection.html#cfn-imagebuilder-lifecyclepolicy-recipeselection-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The version of the Image Builder recipe specified by the `name` field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-recipeselection.html#cfn-imagebuilder-lifecyclepolicy-recipeselection-semanticversion)
       */
      override fun semanticVersion(): String = unwrap(this).getSemanticVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty):
          RecipeSelectionProperty = CdkObjectWrappers.wrap(cdkObject) as? RecipeSelectionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipeSelectionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty
    }
  }

  /**
   * Resource selection criteria for the lifecycle policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * ResourceSelectionProperty resourceSelectionProperty = ResourceSelectionProperty.builder()
   * .recipes(List.of(RecipeSelectionProperty.builder()
   * .name("name")
   * .semanticVersion("semanticVersion")
   * .build()))
   * .tagMap(Map.of(
   * "tagMapKey", "tagMap"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-resourceselection.html)
   */
  public interface ResourceSelectionProperty {
    /**
     * A list of recipes that are used as selection criteria for the output images that the
     * lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-resourceselection.html#cfn-imagebuilder-lifecyclepolicy-resourceselection-recipes)
     */
    public fun recipes(): Any? = unwrap(this).getRecipes()

    /**
     * A list of tags that are used as selection criteria for the Image Builder image resources that
     * the lifecycle policy applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-resourceselection.html#cfn-imagebuilder-lifecyclepolicy-resourceselection-tagmap)
     */
    public fun tagMap(): Any? = unwrap(this).getTagMap()

    /**
     * A builder for [ResourceSelectionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recipes A list of recipes that are used as selection criteria for the output images
       * that the lifecycle policy applies to.
       */
      public fun recipes(recipes: IResolvable)

      /**
       * @param recipes A list of recipes that are used as selection criteria for the output images
       * that the lifecycle policy applies to.
       */
      public fun recipes(recipes: List<Any>)

      /**
       * @param recipes A list of recipes that are used as selection criteria for the output images
       * that the lifecycle policy applies to.
       */
      public fun recipes(vararg recipes: Any)

      /**
       * @param tagMap A list of tags that are used as selection criteria for the Image Builder
       * image resources that the lifecycle policy applies to.
       */
      public fun tagMap(tagMap: IResolvable)

      /**
       * @param tagMap A list of tags that are used as selection criteria for the Image Builder
       * image resources that the lifecycle policy applies to.
       */
      public fun tagMap(tagMap: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty.builder()

      /**
       * @param recipes A list of recipes that are used as selection criteria for the output images
       * that the lifecycle policy applies to.
       */
      override fun recipes(recipes: IResolvable) {
        cdkBuilder.recipes(recipes.let(IResolvable::unwrap))
      }

      /**
       * @param recipes A list of recipes that are used as selection criteria for the output images
       * that the lifecycle policy applies to.
       */
      override fun recipes(recipes: List<Any>) {
        cdkBuilder.recipes(recipes)
      }

      /**
       * @param recipes A list of recipes that are used as selection criteria for the output images
       * that the lifecycle policy applies to.
       */
      override fun recipes(vararg recipes: Any): Unit = recipes(recipes.toList())

      /**
       * @param tagMap A list of tags that are used as selection criteria for the Image Builder
       * image resources that the lifecycle policy applies to.
       */
      override fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap.let(IResolvable::unwrap))
      }

      /**
       * @param tagMap A list of tags that are used as selection criteria for the Image Builder
       * image resources that the lifecycle policy applies to.
       */
      override fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty,
    ) : CdkObject(cdkObject), ResourceSelectionProperty {
      /**
       * A list of recipes that are used as selection criteria for the output images that the
       * lifecycle policy applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-resourceselection.html#cfn-imagebuilder-lifecyclepolicy-resourceselection-recipes)
       */
      override fun recipes(): Any? = unwrap(this).getRecipes()

      /**
       * A list of tags that are used as selection criteria for the Image Builder image resources
       * that the lifecycle policy applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-lifecyclepolicy-resourceselection.html#cfn-imagebuilder-lifecyclepolicy-resourceselection-tagmap)
       */
      override fun tagMap(): Any? = unwrap(this).getTagMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty):
          ResourceSelectionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceSelectionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSelectionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty
    }
  }
}
