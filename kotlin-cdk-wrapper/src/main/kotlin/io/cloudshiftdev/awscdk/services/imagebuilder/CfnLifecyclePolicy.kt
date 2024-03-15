@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

public open class CfnLifecyclePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun executionRole(): String = unwrap(this).getExecutionRole()

  public open fun executionRole(`value`: String) {
    unwrap(this).setExecutionRole(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun policyDetails(): Any = unwrap(this).getPolicyDetails()

  public open fun policyDetails(`value`: IResolvable) {
    unwrap(this).setPolicyDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun policyDetails(__idx_ac66f0: List<Any>) {
    unwrap(this).setPolicyDetails(__idx_ac66f0)
  }

  public open fun policyDetails(vararg __idx_ac66f0: Any): Unit =
      policyDetails(__idx_ac66f0.toList())

  public open fun resourceSelection(): Any = unwrap(this).getResourceSelection()

  public open fun resourceSelection(`value`: IResolvable) {
    unwrap(this).setResourceSelection(`value`.let(IResolvable::unwrap))
  }

  public open fun resourceSelection(`value`: ResourceSelectionProperty) {
    unwrap(this).setResourceSelection(`value`.let(ResourceSelectionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d03c4b2a83f72498d9e9cde2beb88da4f122dbcaa6e8a50bd80420abed9507b2")
  public open fun resourceSelection(`value`: ResourceSelectionProperty.Builder.() -> Unit): Unit =
      resourceSelection(ResourceSelectionProperty(`value`))

  public open fun resourceType(): String = unwrap(this).getResourceType()

  public open fun resourceType(`value`: String) {
    unwrap(this).setResourceType(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public open fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public open fun tags(`value`: Map<String, String>) {
    unwrap(this).setTags(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun executionRole(executionRole: String)

    public fun name(name: String)

    public fun policyDetails(policyDetails: IResolvable)

    public fun policyDetails(policyDetails: List<Any>)

    public fun policyDetails(vararg policyDetails: Any)

    public fun resourceSelection(resourceSelection: IResolvable)

    public fun resourceSelection(resourceSelection: ResourceSelectionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b694048909f47d075362b9546c0a1899d67512c9b414b769fa22e7ad69d8b44")
    public fun resourceSelection(resourceSelection: ResourceSelectionProperty.Builder.() -> Unit)

    public fun resourceType(resourceType: String)

    public fun status(status: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.Builder
        = software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun executionRole(executionRole: String) {
      cdkBuilder.executionRole(executionRole)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    override fun policyDetails(policyDetails: List<Any>) {
      cdkBuilder.policyDetails(policyDetails)
    }

    override fun policyDetails(vararg policyDetails: Any): Unit =
        policyDetails(policyDetails.toList())

    override fun resourceSelection(resourceSelection: IResolvable) {
      cdkBuilder.resourceSelection(resourceSelection.let(IResolvable::unwrap))
    }

    override fun resourceSelection(resourceSelection: ResourceSelectionProperty) {
      cdkBuilder.resourceSelection(resourceSelection.let(ResourceSelectionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b694048909f47d075362b9546c0a1899d67512c9b414b769fa22e7ad69d8b44")
    override fun resourceSelection(resourceSelection: ResourceSelectionProperty.Builder.() -> Unit):
        Unit = resourceSelection(ResourceSelectionProperty(resourceSelection))

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

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
        software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy = wrapped.cdkObject
  }

  public interface LastLaunchedProperty {
    public fun unit(): String

    public fun `value`(): Number

    @CdkDslMarker
    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty,
    ) : CdkObject(cdkObject), LastLaunchedProperty {
      override fun unit(): String = unwrap(this).getUnit()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LastLaunchedProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty):
          LastLaunchedProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LastLaunchedProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.LastLaunchedProperty
    }
  }

  public interface IncludeResourcesProperty {
    public fun amis(): Any? = unwrap(this).getAmis()

    public fun containers(): Any? = unwrap(this).getContainers()

    public fun snapshots(): Any? = unwrap(this).getSnapshots()

    @CdkDslMarker
    public interface Builder {
      public fun amis(amis: Boolean)

      public fun amis(amis: IResolvable)

      public fun containers(containers: Boolean)

      public fun containers(containers: IResolvable)

      public fun snapshots(snapshots: Boolean)

      public fun snapshots(snapshots: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty.builder()

      override fun amis(amis: Boolean) {
        cdkBuilder.amis(amis)
      }

      override fun amis(amis: IResolvable) {
        cdkBuilder.amis(amis.let(IResolvable::unwrap))
      }

      override fun containers(containers: Boolean) {
        cdkBuilder.containers(containers)
      }

      override fun containers(containers: IResolvable) {
        cdkBuilder.containers(containers.let(IResolvable::unwrap))
      }

      override fun snapshots(snapshots: Boolean) {
        cdkBuilder.snapshots(snapshots)
      }

      override fun snapshots(snapshots: IResolvable) {
        cdkBuilder.snapshots(snapshots.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty,
    ) : CdkObject(cdkObject), IncludeResourcesProperty {
      override fun amis(): Any? = unwrap(this).getAmis()

      override fun containers(): Any? = unwrap(this).getContainers()

      override fun snapshots(): Any? = unwrap(this).getSnapshots()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IncludeResourcesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty):
          IncludeResourcesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IncludeResourcesProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.IncludeResourcesProperty
    }
  }

  public interface ActionProperty {
    public fun includeResources(): Any? = unwrap(this).getIncludeResources()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun includeResources(includeResources: IResolvable)

      public fun includeResources(includeResources: IncludeResourcesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad034d8d4102f123b01d990347b1e1b62631c0d661ae867d50bfd9934c31a4a")
      public fun includeResources(includeResources: IncludeResourcesProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty.builder()

      override fun includeResources(includeResources: IResolvable) {
        cdkBuilder.includeResources(includeResources.let(IResolvable::unwrap))
      }

      override fun includeResources(includeResources: IncludeResourcesProperty) {
        cdkBuilder.includeResources(includeResources.let(IncludeResourcesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("aad034d8d4102f123b01d990347b1e1b62631c0d661ae867d50bfd9934c31a4a")
      override fun includeResources(includeResources: IncludeResourcesProperty.Builder.() -> Unit):
          Unit = includeResources(IncludeResourcesProperty(includeResources))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      override fun includeResources(): Any? = unwrap(this).getIncludeResources()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ActionProperty
    }
  }

  public interface RecipeSelectionProperty {
    public fun name(): String

    public fun semanticVersion(): String

    @CdkDslMarker
    public interface Builder {
      public fun name(name: String)

      public fun semanticVersion(semanticVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun semanticVersion(semanticVersion: String) {
        cdkBuilder.semanticVersion(semanticVersion)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty,
    ) : CdkObject(cdkObject), RecipeSelectionProperty {
      override fun name(): String = unwrap(this).getName()

      override fun semanticVersion(): String = unwrap(this).getSemanticVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty):
          RecipeSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipeSelectionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.RecipeSelectionProperty
    }
  }

  public interface ResourceSelectionProperty {
    public fun recipes(): Any? = unwrap(this).getRecipes()

    public fun tagMap(): Any? = unwrap(this).getTagMap()

    @CdkDslMarker
    public interface Builder {
      public fun recipes(recipes: IResolvable)

      public fun recipes(recipes: List<Any>)

      public fun recipes(vararg recipes: Any)

      public fun tagMap(tagMap: IResolvable)

      public fun tagMap(tagMap: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty.builder()

      override fun recipes(recipes: IResolvable) {
        cdkBuilder.recipes(recipes.let(IResolvable::unwrap))
      }

      override fun recipes(recipes: List<Any>) {
        cdkBuilder.recipes(recipes)
      }

      override fun recipes(vararg recipes: Any): Unit = recipes(recipes.toList())

      override fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap.let(IResolvable::unwrap))
      }

      override fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty,
    ) : CdkObject(cdkObject), ResourceSelectionProperty {
      override fun recipes(): Any? = unwrap(this).getRecipes()

      override fun tagMap(): Any? = unwrap(this).getTagMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty):
          ResourceSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceSelectionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ResourceSelectionProperty
    }
  }

  public interface FilterProperty {
    public fun retainAtLeast(): Number? = unwrap(this).getRetainAtLeast()

    public fun type(): String

    public fun unit(): String? = unwrap(this).getUnit()

    public fun `value`(): Number

    @CdkDslMarker
    public interface Builder {
      public fun retainAtLeast(retainAtLeast: Number)

      public fun type(type: String)

      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty.Builder =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty.builder()

      override fun retainAtLeast(retainAtLeast: Number) {
        cdkBuilder.retainAtLeast(retainAtLeast)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      override fun retainAtLeast(): Number? = unwrap(this).getRetainAtLeast()

      override fun type(): String = unwrap(this).getType()

      override fun unit(): String? = unwrap(this).getUnit()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.FilterProperty
    }
  }

  public interface PolicyDetailProperty {
    public fun action(): Any

    public fun exclusionRules(): Any? = unwrap(this).getExclusionRules()

    public fun filter(): Any

    @CdkDslMarker
    public interface Builder {
      public fun action(action: IResolvable)

      public fun action(action: ActionProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9dbb42e008c2d9f934812afdd7d0401f3db973cb54b7172a6deac66ce238c17")
      public fun action(action: ActionProperty.Builder.() -> Unit)

      public fun exclusionRules(exclusionRules: IResolvable)

      public fun exclusionRules(exclusionRules: ExclusionRulesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2aefbdee6810949a08fbc3ec96996e7ff8320d4c8ad322f84ce069c822106be")
      public fun exclusionRules(exclusionRules: ExclusionRulesProperty.Builder.() -> Unit)

      public fun filter(filter: IResolvable)

      public fun filter(filter: FilterProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e93a5d8726b320824ecbcb01841580b080f8860aa78ed0736beb59b4dc81ec")
      public fun filter(filter: FilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty.builder()

      override fun action(action: IResolvable) {
        cdkBuilder.action(action.let(IResolvable::unwrap))
      }

      override fun action(action: ActionProperty) {
        cdkBuilder.action(action.let(ActionProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9dbb42e008c2d9f934812afdd7d0401f3db973cb54b7172a6deac66ce238c17")
      override fun action(action: ActionProperty.Builder.() -> Unit): Unit =
          action(ActionProperty(action))

      override fun exclusionRules(exclusionRules: IResolvable) {
        cdkBuilder.exclusionRules(exclusionRules.let(IResolvable::unwrap))
      }

      override fun exclusionRules(exclusionRules: ExclusionRulesProperty) {
        cdkBuilder.exclusionRules(exclusionRules.let(ExclusionRulesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2aefbdee6810949a08fbc3ec96996e7ff8320d4c8ad322f84ce069c822106be")
      override fun exclusionRules(exclusionRules: ExclusionRulesProperty.Builder.() -> Unit): Unit =
          exclusionRules(ExclusionRulesProperty(exclusionRules))

      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      override fun filter(filter: FilterProperty) {
        cdkBuilder.filter(filter.let(FilterProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("48e93a5d8726b320824ecbcb01841580b080f8860aa78ed0736beb59b4dc81ec")
      override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
          filter(FilterProperty(filter))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty,
    ) : CdkObject(cdkObject), PolicyDetailProperty {
      override fun action(): Any = unwrap(this).getAction()

      override fun exclusionRules(): Any? = unwrap(this).getExclusionRules()

      override fun filter(): Any = unwrap(this).getFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty):
          PolicyDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyDetailProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.PolicyDetailProperty
    }
  }

  public interface AmiExclusionRulesProperty {
    public fun isPublic(): Any? = unwrap(this).getIsPublic()

    public fun lastLaunched(): Any? = unwrap(this).getLastLaunched()

    public fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

    public fun sharedAccounts(): List<String> = unwrap(this).getSharedAccounts() ?: emptyList()

    public fun tagMap(): Any? = unwrap(this).getTagMap()

    @CdkDslMarker
    public interface Builder {
      public fun isPublic(isPublic: Boolean)

      public fun isPublic(isPublic: IResolvable)

      public fun lastLaunched(lastLaunched: IResolvable)

      public fun lastLaunched(lastLaunched: LastLaunchedProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88db98081f27153c3fd435b4d3401bbc9f02f63b4b3009e0d191966948c431eb")
      public fun lastLaunched(lastLaunched: LastLaunchedProperty.Builder.() -> Unit)

      public fun regions(regions: List<String>)

      public fun regions(vararg regions: String)

      public fun sharedAccounts(sharedAccounts: List<String>)

      public fun sharedAccounts(vararg sharedAccounts: String)

      public fun tagMap(tagMap: IResolvable)

      public fun tagMap(tagMap: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty.builder()

      override fun isPublic(isPublic: Boolean) {
        cdkBuilder.isPublic(isPublic)
      }

      override fun isPublic(isPublic: IResolvable) {
        cdkBuilder.isPublic(isPublic.let(IResolvable::unwrap))
      }

      override fun lastLaunched(lastLaunched: IResolvable) {
        cdkBuilder.lastLaunched(lastLaunched.let(IResolvable::unwrap))
      }

      override fun lastLaunched(lastLaunched: LastLaunchedProperty) {
        cdkBuilder.lastLaunched(lastLaunched.let(LastLaunchedProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("88db98081f27153c3fd435b4d3401bbc9f02f63b4b3009e0d191966948c431eb")
      override fun lastLaunched(lastLaunched: LastLaunchedProperty.Builder.() -> Unit): Unit =
          lastLaunched(LastLaunchedProperty(lastLaunched))

      override fun regions(regions: List<String>) {
        cdkBuilder.regions(regions)
      }

      override fun regions(vararg regions: String): Unit = regions(regions.toList())

      override fun sharedAccounts(sharedAccounts: List<String>) {
        cdkBuilder.sharedAccounts(sharedAccounts)
      }

      override fun sharedAccounts(vararg sharedAccounts: String): Unit =
          sharedAccounts(sharedAccounts.toList())

      override fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap.let(IResolvable::unwrap))
      }

      override fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty,
    ) : CdkObject(cdkObject), AmiExclusionRulesProperty {
      override fun isPublic(): Any? = unwrap(this).getIsPublic()

      override fun lastLaunched(): Any? = unwrap(this).getLastLaunched()

      override fun regions(): List<String> = unwrap(this).getRegions() ?: emptyList()

      override fun sharedAccounts(): List<String> = unwrap(this).getSharedAccounts() ?: emptyList()

      override fun tagMap(): Any? = unwrap(this).getTagMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AmiExclusionRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty):
          AmiExclusionRulesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmiExclusionRulesProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.AmiExclusionRulesProperty
    }
  }

  public interface ExclusionRulesProperty {
    public fun amis(): Any? = unwrap(this).getAmis()

    public fun tagMap(): Any? = unwrap(this).getTagMap()

    @CdkDslMarker
    public interface Builder {
      public fun amis(amis: IResolvable)

      public fun amis(amis: AmiExclusionRulesProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2122b0a58ad15c1af0fb85f28b31361f85dd23377995c8c5ea473b2a188a9de")
      public fun amis(amis: AmiExclusionRulesProperty.Builder.() -> Unit)

      public fun tagMap(tagMap: IResolvable)

      public fun tagMap(tagMap: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty.builder()

      override fun amis(amis: IResolvable) {
        cdkBuilder.amis(amis.let(IResolvable::unwrap))
      }

      override fun amis(amis: AmiExclusionRulesProperty) {
        cdkBuilder.amis(amis.let(AmiExclusionRulesProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c2122b0a58ad15c1af0fb85f28b31361f85dd23377995c8c5ea473b2a188a9de")
      override fun amis(amis: AmiExclusionRulesProperty.Builder.() -> Unit): Unit =
          amis(AmiExclusionRulesProperty(amis))

      override fun tagMap(tagMap: IResolvable) {
        cdkBuilder.tagMap(tagMap.let(IResolvable::unwrap))
      }

      override fun tagMap(tagMap: Map<String, String>) {
        cdkBuilder.tagMap(tagMap)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty,
    ) : CdkObject(cdkObject), ExclusionRulesProperty {
      override fun amis(): Any? = unwrap(this).getAmis()

      override fun tagMap(): Any? = unwrap(this).getTagMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionRulesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty):
          ExclusionRulesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionRulesProperty):
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnLifecyclePolicy.ExclusionRulesProperty
    }
  }
}
