@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.dlm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLifecyclePolicy internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun copyTags(): Any? = unwrap(this).getCopyTags()

  public open fun copyTags(`value`: Boolean) {
    unwrap(this).setCopyTags(`value`)
  }

  public open fun copyTags(`value`: IResolvable) {
    unwrap(this).setCopyTags(`value`.let(IResolvable::unwrap))
  }

  public open fun createInterval(): Number? = unwrap(this).getCreateInterval()

  public open fun createInterval(`value`: Number) {
    unwrap(this).setCreateInterval(`value`)
  }

  public open fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

  public open fun crossRegionCopyTargets(`value`: Any) {
    unwrap(this).setCrossRegionCopyTargets(`value`)
  }

  public open fun defaultPolicy(): String? = unwrap(this).getDefaultPolicy()

  public open fun defaultPolicy(`value`: String) {
    unwrap(this).setDefaultPolicy(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun exclusions(): Any? = unwrap(this).getExclusions()

  public open fun exclusions(`value`: IResolvable) {
    unwrap(this).setExclusions(`value`.let(IResolvable::unwrap))
  }

  public open fun exclusions(`value`: ExclusionsProperty) {
    unwrap(this).setExclusions(`value`.let(ExclusionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("228fc02e5b97990ae25414c79f1039857584d5d1f8f890ad467e3ae1ece0f7cf")
  public open fun exclusions(`value`: ExclusionsProperty.Builder.() -> Unit): Unit =
      exclusions(ExclusionsProperty(`value`))

  public open fun executionRoleArn(): String? = unwrap(this).getExecutionRoleArn()

  public open fun executionRoleArn(`value`: String) {
    unwrap(this).setExecutionRoleArn(`value`)
  }

  public open fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

  public open fun extendDeletion(`value`: Boolean) {
    unwrap(this).setExtendDeletion(`value`)
  }

  public open fun extendDeletion(`value`: IResolvable) {
    unwrap(this).setExtendDeletion(`value`.let(IResolvable::unwrap))
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policyDetails(): Any? = unwrap(this).getPolicyDetails()

  public open fun policyDetails(`value`: IResolvable) {
    unwrap(this).setPolicyDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun policyDetails(`value`: PolicyDetailsProperty) {
    unwrap(this).setPolicyDetails(`value`.let(PolicyDetailsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("128675c943961d271f3fb394ef7023f53a5b1b3096974918ad853370acb0b295")
  public open fun policyDetails(`value`: PolicyDetailsProperty.Builder.() -> Unit): Unit =
      policyDetails(PolicyDetailsProperty(`value`))

  public open fun retainInterval(): Number? = unwrap(this).getRetainInterval()

  public open fun retainInterval(`value`: Number) {
    unwrap(this).setRetainInterval(`value`)
  }

  public open fun state(): String? = unwrap(this).getState()

  public open fun state(`value`: String) {
    unwrap(this).setState(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun copyTags(copyTags: Boolean)

    public fun copyTags(copyTags: IResolvable)

    public fun createInterval(createInterval: Number)

    public fun crossRegionCopyTargets(crossRegionCopyTargets: Any)

    public fun defaultPolicy(defaultPolicy: String)

    public fun description(description: String)

    public fun exclusions(exclusions: IResolvable)

    public fun exclusions(exclusions: ExclusionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("417e5709901c173f3458bad230ac75cfff8db50ed3b536d683412a8e62a76d22")
    public fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit)

    public fun executionRoleArn(executionRoleArn: String)

    public fun extendDeletion(extendDeletion: Boolean)

    public fun extendDeletion(extendDeletion: IResolvable)

    public fun policyDetails(policyDetails: IResolvable)

    public fun policyDetails(policyDetails: PolicyDetailsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddf21f53e23f44a93e1aa8317fd8f4e69e074d10761bd83c4869006ef3c64f76")
    public fun policyDetails(policyDetails: PolicyDetailsProperty.Builder.() -> Unit)

    public fun retainInterval(retainInterval: Number)

    public fun state(state: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.Builder =
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.Builder.create(scope, id)

    override fun copyTags(copyTags: Boolean) {
      cdkBuilder.copyTags(copyTags)
    }

    override fun copyTags(copyTags: IResolvable) {
      cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
    }

    override fun createInterval(createInterval: Number) {
      cdkBuilder.createInterval(createInterval)
    }

    override fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
      cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
    }

    override fun defaultPolicy(defaultPolicy: String) {
      cdkBuilder.defaultPolicy(defaultPolicy)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun exclusions(exclusions: IResolvable) {
      cdkBuilder.exclusions(exclusions.let(IResolvable::unwrap))
    }

    override fun exclusions(exclusions: ExclusionsProperty) {
      cdkBuilder.exclusions(exclusions.let(ExclusionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("417e5709901c173f3458bad230ac75cfff8db50ed3b536d683412a8e62a76d22")
    override fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit): Unit =
        exclusions(ExclusionsProperty(exclusions))

    override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    override fun extendDeletion(extendDeletion: Boolean) {
      cdkBuilder.extendDeletion(extendDeletion)
    }

    override fun extendDeletion(extendDeletion: IResolvable) {
      cdkBuilder.extendDeletion(extendDeletion.let(IResolvable::unwrap))
    }

    override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    override fun policyDetails(policyDetails: PolicyDetailsProperty) {
      cdkBuilder.policyDetails(policyDetails.let(PolicyDetailsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddf21f53e23f44a93e1aa8317fd8f4e69e074d10761bd83c4869006ef3c64f76")
    override fun policyDetails(policyDetails: PolicyDetailsProperty.Builder.() -> Unit): Unit =
        policyDetails(PolicyDetailsProperty(policyDetails))

    override fun retainInterval(retainInterval: Number) {
      cdkBuilder.retainInterval(retainInterval)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLifecyclePolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLifecyclePolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy):
        CfnLifecyclePolicy = CfnLifecyclePolicy(cdkObject)

    internal fun unwrap(wrapped: CfnLifecyclePolicy):
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicy = wrapped.cdkObject
  }

  public interface RetainRuleProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    @CdkDslMarker
    public interface Builder {
      public fun count(count: Number)

      public fun interval(interval: Number)

      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.builder()

      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty,
    ) : CdkObject(cdkObject), RetainRuleProperty {
      override fun count(): Number? = unwrap(this).getCount()

      override fun interval(): Number? = unwrap(this).getInterval()

      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty):
          RetainRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty
    }
  }

  public interface EventParametersProperty {
    public fun descriptionRegex(): String? = unwrap(this).getDescriptionRegex()

    public fun eventType(): String

    public fun snapshotOwner(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun descriptionRegex(descriptionRegex: String)

      public fun eventType(eventType: String)

      public fun snapshotOwner(snapshotOwner: List<String>)

      public fun snapshotOwner(vararg snapshotOwner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.builder()

      override fun descriptionRegex(descriptionRegex: String) {
        cdkBuilder.descriptionRegex(descriptionRegex)
      }

      override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      override fun snapshotOwner(snapshotOwner: List<String>) {
        cdkBuilder.snapshotOwner(snapshotOwner)
      }

      override fun snapshotOwner(vararg snapshotOwner: String): Unit =
          snapshotOwner(snapshotOwner.toList())

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty,
    ) : CdkObject(cdkObject), EventParametersProperty {
      override fun descriptionRegex(): String? = unwrap(this).getDescriptionRegex()

      override fun eventType(): String = unwrap(this).getEventType()

      override fun snapshotOwner(): List<String> = unwrap(this).getSnapshotOwner()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty):
          EventParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventParametersProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty
    }
  }

  public interface ActionProperty {
    public fun crossRegionCopy(): Any

    public fun name(): String

    @CdkDslMarker
    public interface Builder {
      public fun crossRegionCopy(crossRegionCopy: IResolvable)

      public fun crossRegionCopy(crossRegionCopy: List<Any>)

      public fun crossRegionCopy(vararg crossRegionCopy: Any)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.builder()

      override fun crossRegionCopy(crossRegionCopy: IResolvable) {
        cdkBuilder.crossRegionCopy(crossRegionCopy.let(IResolvable::unwrap))
      }

      override fun crossRegionCopy(crossRegionCopy: List<Any>) {
        cdkBuilder.crossRegionCopy(crossRegionCopy)
      }

      override fun crossRegionCopy(vararg crossRegionCopy: Any): Unit =
          crossRegionCopy(crossRegionCopy.toList())

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty,
    ) : CdkObject(cdkObject), ActionProperty {
      override fun crossRegionCopy(): Any = unwrap(this).getCrossRegionCopy()

      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty
    }
  }

  public interface ParametersProperty {
    public fun excludeBootVolume(): Any? = unwrap(this).getExcludeBootVolume()

    public fun excludeDataVolumeTags(): Any? = unwrap(this).getExcludeDataVolumeTags()

    public fun noReboot(): Any? = unwrap(this).getNoReboot()

    @CdkDslMarker
    public interface Builder {
      public fun excludeBootVolume(excludeBootVolume: Boolean)

      public fun excludeBootVolume(excludeBootVolume: IResolvable)

      public fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable)

      public fun excludeDataVolumeTags(excludeDataVolumeTags: List<Any>)

      public fun excludeDataVolumeTags(vararg excludeDataVolumeTags: Any)

      public fun noReboot(noReboot: Boolean)

      public fun noReboot(noReboot: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty.builder()

      override fun excludeBootVolume(excludeBootVolume: Boolean) {
        cdkBuilder.excludeBootVolume(excludeBootVolume)
      }

      override fun excludeBootVolume(excludeBootVolume: IResolvable) {
        cdkBuilder.excludeBootVolume(excludeBootVolume.let(IResolvable::unwrap))
      }

      override fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable) {
        cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags.let(IResolvable::unwrap))
      }

      override fun excludeDataVolumeTags(excludeDataVolumeTags: List<Any>) {
        cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags)
      }

      override fun excludeDataVolumeTags(vararg excludeDataVolumeTags: Any): Unit =
          excludeDataVolumeTags(excludeDataVolumeTags.toList())

      override fun noReboot(noReboot: Boolean) {
        cdkBuilder.noReboot(noReboot)
      }

      override fun noReboot(noReboot: IResolvable) {
        cdkBuilder.noReboot(noReboot.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty,
    ) : CdkObject(cdkObject), ParametersProperty {
      override fun excludeBootVolume(): Any? = unwrap(this).getExcludeBootVolume()

      override fun excludeDataVolumeTags(): Any? = unwrap(this).getExcludeDataVolumeTags()

      override fun noReboot(): Any? = unwrap(this).getNoReboot()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty):
          ParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParametersProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty
    }
  }

  public interface EventSourceProperty {
    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun type(): String

    @CdkDslMarker
    public interface Builder {
      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: EventParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1a8456c119a6ab5e78a9fe2209d5e66ecc1d392e84cfbb43a437e6349e6d39")
      public fun parameters(parameters: EventParametersProperty.Builder.() -> Unit)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.builder()

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: EventParametersProperty) {
        cdkBuilder.parameters(parameters.let(EventParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1a8456c119a6ab5e78a9fe2209d5e66ecc1d392e84cfbb43a437e6349e6d39")
      override fun parameters(parameters: EventParametersProperty.Builder.() -> Unit): Unit =
          parameters(EventParametersProperty(parameters))

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty,
    ) : CdkObject(cdkObject), EventSourceProperty {
      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty):
          EventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSourceProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty
    }
  }

  public interface CrossRegionCopyDeprecateRuleProperty {
    public fun interval(): Number

    public fun intervalUnit(): String

    @CdkDslMarker
    public interface Builder {
      public fun interval(interval: Number)

      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.builder()

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyDeprecateRuleProperty {
      override fun interval(): Number = unwrap(this).getInterval()

      override fun intervalUnit(): String = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CrossRegionCopyDeprecateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty):
          CrossRegionCopyDeprecateRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyDeprecateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
    }
  }

  public interface ShareRuleProperty {
    public fun targetAccounts(): List<String> = unwrap(this).getTargetAccounts() ?: emptyList()

    public fun unshareInterval(): Number? = unwrap(this).getUnshareInterval()

    public fun unshareIntervalUnit(): String? = unwrap(this).getUnshareIntervalUnit()

    @CdkDslMarker
    public interface Builder {
      public fun targetAccounts(targetAccounts: List<String>)

      public fun targetAccounts(vararg targetAccounts: String)

      public fun unshareInterval(unshareInterval: Number)

      public fun unshareIntervalUnit(unshareIntervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty.builder()

      override fun targetAccounts(targetAccounts: List<String>) {
        cdkBuilder.targetAccounts(targetAccounts)
      }

      override fun targetAccounts(vararg targetAccounts: String): Unit =
          targetAccounts(targetAccounts.toList())

      override fun unshareInterval(unshareInterval: Number) {
        cdkBuilder.unshareInterval(unshareInterval)
      }

      override fun unshareIntervalUnit(unshareIntervalUnit: String) {
        cdkBuilder.unshareIntervalUnit(unshareIntervalUnit)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty,
    ) : CdkObject(cdkObject), ShareRuleProperty {
      override fun targetAccounts(): List<String> = unwrap(this).getTargetAccounts() ?: emptyList()

      override fun unshareInterval(): Number? = unwrap(this).getUnshareInterval()

      override fun unshareIntervalUnit(): String? = unwrap(this).getUnshareIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ShareRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty):
          ShareRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShareRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty
    }
  }

  public interface FastRestoreRuleProperty {
    public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    public fun count(): Number? = unwrap(this).getCount()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    @CdkDslMarker
    public interface Builder {
      public fun availabilityZones(availabilityZones: List<String>)

      public fun availabilityZones(vararg availabilityZones: String)

      public fun count(count: Number)

      public fun interval(interval: Number)

      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty.builder()

      override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      override fun availabilityZones(vararg availabilityZones: String): Unit =
          availabilityZones(availabilityZones.toList())

      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty,
    ) : CdkObject(cdkObject), FastRestoreRuleProperty {
      override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()

      override fun count(): Number? = unwrap(this).getCount()

      override fun interval(): Number? = unwrap(this).getInterval()

      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FastRestoreRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty):
          FastRestoreRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastRestoreRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty
    }
  }

  public interface RetentionArchiveTierProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    @CdkDslMarker
    public interface Builder {
      public fun count(count: Number)

      public fun interval(interval: Number)

      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty.builder()

      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty,
    ) : CdkObject(cdkObject), RetentionArchiveTierProperty {
      override fun count(): Number? = unwrap(this).getCount()

      override fun interval(): Number? = unwrap(this).getInterval()

      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionArchiveTierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty):
          RetentionArchiveTierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionArchiveTierProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty
    }
  }

  public interface ScheduleProperty {
    public fun archiveRule(): Any? = unwrap(this).getArchiveRule()

    public fun copyTags(): Any? = unwrap(this).getCopyTags()

    public fun createRule(): Any? = unwrap(this).getCreateRule()

    public fun crossRegionCopyRules(): Any? = unwrap(this).getCrossRegionCopyRules()

    public fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

    public fun fastRestoreRule(): Any? = unwrap(this).getFastRestoreRule()

    public fun name(): String? = unwrap(this).getName()

    public fun retainRule(): Any? = unwrap(this).getRetainRule()

    public fun shareRules(): Any? = unwrap(this).getShareRules()

    public fun tagsToAdd(): Any? = unwrap(this).getTagsToAdd()

    public fun variableTags(): Any? = unwrap(this).getVariableTags()

    @CdkDslMarker
    public interface Builder {
      public fun archiveRule(archiveRule: IResolvable)

      public fun archiveRule(archiveRule: ArchiveRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825dead620cc6ea08a641afcd158f0cc401bd80dfd5c87605bacaf652b0ce3a1")
      public fun archiveRule(archiveRule: ArchiveRuleProperty.Builder.() -> Unit)

      public fun copyTags(copyTags: Boolean)

      public fun copyTags(copyTags: IResolvable)

      public fun createRule(createRule: IResolvable)

      public fun createRule(createRule: CreateRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54891bc79136e1c87930dfbd441d43e610d3d82bccfced6e1bdf038d422a97b8")
      public fun createRule(createRule: CreateRuleProperty.Builder.() -> Unit)

      public fun crossRegionCopyRules(crossRegionCopyRules: IResolvable)

      public fun crossRegionCopyRules(crossRegionCopyRules: List<Any>)

      public fun crossRegionCopyRules(vararg crossRegionCopyRules: Any)

      public fun deprecateRule(deprecateRule: IResolvable)

      public fun deprecateRule(deprecateRule: DeprecateRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb7a0258a6a743ee09f1b22132dea6f3341e66f8726bb797909b7292faed4270")
      public fun deprecateRule(deprecateRule: DeprecateRuleProperty.Builder.() -> Unit)

      public fun fastRestoreRule(fastRestoreRule: IResolvable)

      public fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e27b9391e7a38b3c973427c0f60208402a121bef2c15bbc3199f4c686769530a")
      public fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty.Builder.() -> Unit)

      public fun name(name: String)

      public fun retainRule(retainRule: IResolvable)

      public fun retainRule(retainRule: RetainRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98893537e56c00100b0f8d465996d0e9a2d0071e41103b84fb051fa0820b0529")
      public fun retainRule(retainRule: RetainRuleProperty.Builder.() -> Unit)

      public fun shareRules(shareRules: IResolvable)

      public fun shareRules(shareRules: List<Any>)

      public fun shareRules(vararg shareRules: Any)

      public fun tagsToAdd(tagsToAdd: IResolvable)

      public fun tagsToAdd(tagsToAdd: List<Any>)

      public fun tagsToAdd(vararg tagsToAdd: Any)

      public fun variableTags(variableTags: IResolvable)

      public fun variableTags(variableTags: List<Any>)

      public fun variableTags(vararg variableTags: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.builder()

      override fun archiveRule(archiveRule: IResolvable) {
        cdkBuilder.archiveRule(archiveRule.let(IResolvable::unwrap))
      }

      override fun archiveRule(archiveRule: ArchiveRuleProperty) {
        cdkBuilder.archiveRule(archiveRule.let(ArchiveRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825dead620cc6ea08a641afcd158f0cc401bd80dfd5c87605bacaf652b0ce3a1")
      override fun archiveRule(archiveRule: ArchiveRuleProperty.Builder.() -> Unit): Unit =
          archiveRule(ArchiveRuleProperty(archiveRule))

      override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      override fun createRule(createRule: IResolvable) {
        cdkBuilder.createRule(createRule.let(IResolvable::unwrap))
      }

      override fun createRule(createRule: CreateRuleProperty) {
        cdkBuilder.createRule(createRule.let(CreateRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54891bc79136e1c87930dfbd441d43e610d3d82bccfced6e1bdf038d422a97b8")
      override fun createRule(createRule: CreateRuleProperty.Builder.() -> Unit): Unit =
          createRule(CreateRuleProperty(createRule))

      override fun crossRegionCopyRules(crossRegionCopyRules: IResolvable) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules.let(IResolvable::unwrap))
      }

      override fun crossRegionCopyRules(crossRegionCopyRules: List<Any>) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules)
      }

      override fun crossRegionCopyRules(vararg crossRegionCopyRules: Any): Unit =
          crossRegionCopyRules(crossRegionCopyRules.toList())

      override fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule.let(IResolvable::unwrap))
      }

      override fun deprecateRule(deprecateRule: DeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule.let(DeprecateRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb7a0258a6a743ee09f1b22132dea6f3341e66f8726bb797909b7292faed4270")
      override fun deprecateRule(deprecateRule: DeprecateRuleProperty.Builder.() -> Unit): Unit =
          deprecateRule(DeprecateRuleProperty(deprecateRule))

      override fun fastRestoreRule(fastRestoreRule: IResolvable) {
        cdkBuilder.fastRestoreRule(fastRestoreRule.let(IResolvable::unwrap))
      }

      override fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty) {
        cdkBuilder.fastRestoreRule(fastRestoreRule.let(FastRestoreRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e27b9391e7a38b3c973427c0f60208402a121bef2c15bbc3199f4c686769530a")
      override fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty.Builder.() -> Unit):
          Unit = fastRestoreRule(FastRestoreRuleProperty(fastRestoreRule))

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      override fun retainRule(retainRule: RetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(RetainRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98893537e56c00100b0f8d465996d0e9a2d0071e41103b84fb051fa0820b0529")
      override fun retainRule(retainRule: RetainRuleProperty.Builder.() -> Unit): Unit =
          retainRule(RetainRuleProperty(retainRule))

      override fun shareRules(shareRules: IResolvable) {
        cdkBuilder.shareRules(shareRules.let(IResolvable::unwrap))
      }

      override fun shareRules(shareRules: List<Any>) {
        cdkBuilder.shareRules(shareRules)
      }

      override fun shareRules(vararg shareRules: Any): Unit = shareRules(shareRules.toList())

      override fun tagsToAdd(tagsToAdd: IResolvable) {
        cdkBuilder.tagsToAdd(tagsToAdd.let(IResolvable::unwrap))
      }

      override fun tagsToAdd(tagsToAdd: List<Any>) {
        cdkBuilder.tagsToAdd(tagsToAdd)
      }

      override fun tagsToAdd(vararg tagsToAdd: Any): Unit = tagsToAdd(tagsToAdd.toList())

      override fun variableTags(variableTags: IResolvable) {
        cdkBuilder.variableTags(variableTags.let(IResolvable::unwrap))
      }

      override fun variableTags(variableTags: List<Any>) {
        cdkBuilder.variableTags(variableTags)
      }

      override fun variableTags(vararg variableTags: Any): Unit =
          variableTags(variableTags.toList())

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty,
    ) : CdkObject(cdkObject), ScheduleProperty {
      override fun archiveRule(): Any? = unwrap(this).getArchiveRule()

      override fun copyTags(): Any? = unwrap(this).getCopyTags()

      override fun createRule(): Any? = unwrap(this).getCreateRule()

      override fun crossRegionCopyRules(): Any? = unwrap(this).getCrossRegionCopyRules()

      override fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

      override fun fastRestoreRule(): Any? = unwrap(this).getFastRestoreRule()

      override fun name(): String? = unwrap(this).getName()

      override fun retainRule(): Any? = unwrap(this).getRetainRule()

      override fun shareRules(): Any? = unwrap(this).getShareRules()

      override fun tagsToAdd(): Any? = unwrap(this).getTagsToAdd()

      override fun variableTags(): Any? = unwrap(this).getVariableTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty
    }
  }

  public interface ArchiveRuleProperty {
    public fun retainRule(): Any

    @CdkDslMarker
    public interface Builder {
      public fun retainRule(retainRule: IResolvable)

      public fun retainRule(retainRule: ArchiveRetainRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22112598039fa0891c015794eab927b32a7c3cace5a3606f9960cb6a144f4b1e")
      public fun retainRule(retainRule: ArchiveRetainRuleProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty.builder()

      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      override fun retainRule(retainRule: ArchiveRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(ArchiveRetainRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22112598039fa0891c015794eab927b32a7c3cace5a3606f9960cb6a144f4b1e")
      override fun retainRule(retainRule: ArchiveRetainRuleProperty.Builder.() -> Unit): Unit =
          retainRule(ArchiveRetainRuleProperty(retainRule))

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty,
    ) : CdkObject(cdkObject), ArchiveRuleProperty {
      override fun retainRule(): Any = unwrap(this).getRetainRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty):
          ArchiveRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty
    }
  }

  public interface CreateRuleProperty {
    public fun cronExpression(): String? = unwrap(this).getCronExpression()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    public fun location(): String? = unwrap(this).getLocation()

    public fun scripts(): Any? = unwrap(this).getScripts()

    public fun times(): List<String> = unwrap(this).getTimes() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun cronExpression(cronExpression: String)

      public fun interval(interval: Number)

      public fun intervalUnit(intervalUnit: String)

      public fun location(location: String)

      public fun scripts(scripts: IResolvable)

      public fun scripts(scripts: List<Any>)

      public fun scripts(vararg scripts: Any)

      public fun times(times: List<String>)

      public fun times(vararg times: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.builder()

      override fun cronExpression(cronExpression: String) {
        cdkBuilder.cronExpression(cronExpression)
      }

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      override fun location(location: String) {
        cdkBuilder.location(location)
      }

      override fun scripts(scripts: IResolvable) {
        cdkBuilder.scripts(scripts.let(IResolvable::unwrap))
      }

      override fun scripts(scripts: List<Any>) {
        cdkBuilder.scripts(scripts)
      }

      override fun scripts(vararg scripts: Any): Unit = scripts(scripts.toList())

      override fun times(times: List<String>) {
        cdkBuilder.times(times)
      }

      override fun times(vararg times: String): Unit = times(times.toList())

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty,
    ) : CdkObject(cdkObject), CreateRuleProperty {
      override fun cronExpression(): String? = unwrap(this).getCronExpression()

      override fun interval(): Number? = unwrap(this).getInterval()

      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

      override fun location(): String? = unwrap(this).getLocation()

      override fun scripts(): Any? = unwrap(this).getScripts()

      override fun times(): List<String> = unwrap(this).getTimes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty):
          CreateRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty
    }
  }

  public interface ScriptProperty {
    public fun executeOperationOnScriptFailure(): Any? =
        unwrap(this).getExecuteOperationOnScriptFailure()

    public fun executionHandler(): String? = unwrap(this).getExecutionHandler()

    public fun executionHandlerService(): String? = unwrap(this).getExecutionHandlerService()

    public fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()

    public fun maximumRetryCount(): Number? = unwrap(this).getMaximumRetryCount()

    public fun stages(): List<String> = unwrap(this).getStages() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: Boolean)

      public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: IResolvable)

      public fun executionHandler(executionHandler: String)

      public fun executionHandlerService(executionHandlerService: String)

      public fun executionTimeout(executionTimeout: Number)

      public fun maximumRetryCount(maximumRetryCount: Number)

      public fun stages(stages: List<String>)

      public fun stages(vararg stages: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty.builder()

      override fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: Boolean) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure)
      }

      override fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: IResolvable) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure.let(IResolvable::unwrap))
      }

      override fun executionHandler(executionHandler: String) {
        cdkBuilder.executionHandler(executionHandler)
      }

      override fun executionHandlerService(executionHandlerService: String) {
        cdkBuilder.executionHandlerService(executionHandlerService)
      }

      override fun executionTimeout(executionTimeout: Number) {
        cdkBuilder.executionTimeout(executionTimeout)
      }

      override fun maximumRetryCount(maximumRetryCount: Number) {
        cdkBuilder.maximumRetryCount(maximumRetryCount)
      }

      override fun stages(stages: List<String>) {
        cdkBuilder.stages(stages)
      }

      override fun stages(vararg stages: String): Unit = stages(stages.toList())

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty,
    ) : CdkObject(cdkObject), ScriptProperty {
      override fun executeOperationOnScriptFailure(): Any? =
          unwrap(this).getExecuteOperationOnScriptFailure()

      override fun executionHandler(): String? = unwrap(this).getExecutionHandler()

      override fun executionHandlerService(): String? = unwrap(this).getExecutionHandlerService()

      override fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()

      override fun maximumRetryCount(): Number? = unwrap(this).getMaximumRetryCount()

      override fun stages(): List<String> = unwrap(this).getStages() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty):
          ScriptProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty
    }
  }

  public interface CrossRegionCopyRuleProperty {
    public fun cmkArn(): String? = unwrap(this).getCmkArn()

    public fun copyTags(): Any? = unwrap(this).getCopyTags()

    public fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

    public fun encrypted(): Any

    public fun retainRule(): Any? = unwrap(this).getRetainRule()

    public fun target(): String? = unwrap(this).getTarget()

    public fun targetRegion(): String? = unwrap(this).getTargetRegion()

    @CdkDslMarker
    public interface Builder {
      public fun cmkArn(cmkArn: String)

      public fun copyTags(copyTags: Boolean)

      public fun copyTags(copyTags: IResolvable)

      public fun deprecateRule(deprecateRule: IResolvable)

      public fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e611e77205c99955185e3196c511607f8e5072ade57cabcd9b0cb66b22ae65")
      public
          fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty.Builder.() -> Unit)

      public fun encrypted(encrypted: Boolean)

      public fun encrypted(encrypted: IResolvable)

      public fun retainRule(retainRule: IResolvable)

      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("167e01da92a571d38b2ea00ebe7df6e195e691b240f448676b5a2ca926bbda1d")
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit)

      public fun target(target: String)

      public fun targetRegion(targetRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty.builder()

      override fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
      }

      override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      override fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule.let(IResolvable::unwrap))
      }

      override fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule.let(CrossRegionCopyDeprecateRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e611e77205c99955185e3196c511607f8e5072ade57cabcd9b0cb66b22ae65")
      override
          fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty.Builder.() -> Unit):
          Unit = deprecateRule(CrossRegionCopyDeprecateRuleProperty(deprecateRule))

      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(CrossRegionCopyRetainRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("167e01da92a571d38b2ea00ebe7df6e195e691b240f448676b5a2ca926bbda1d")
      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit):
          Unit = retainRule(CrossRegionCopyRetainRuleProperty(retainRule))

      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      override fun targetRegion(targetRegion: String) {
        cdkBuilder.targetRegion(targetRegion)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyRuleProperty {
      override fun cmkArn(): String? = unwrap(this).getCmkArn()

      override fun copyTags(): Any? = unwrap(this).getCopyTags()

      override fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

      override fun encrypted(): Any = unwrap(this).getEncrypted()

      override fun retainRule(): Any? = unwrap(this).getRetainRule()

      override fun target(): String? = unwrap(this).getTarget()

      override fun targetRegion(): String? = unwrap(this).getTargetRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionCopyRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty):
          CrossRegionCopyRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty
    }
  }

  public interface PolicyDetailsProperty {
    public fun actions(): Any? = unwrap(this).getActions()

    public fun copyTags(): Any? = unwrap(this).getCopyTags()

    public fun createInterval(): Number? = unwrap(this).getCreateInterval()

    public fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

    public fun eventSource(): Any? = unwrap(this).getEventSource()

    public fun exclusions(): Any? = unwrap(this).getExclusions()

    public fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun policyLanguage(): String? = unwrap(this).getPolicyLanguage()

    public fun policyType(): String? = unwrap(this).getPolicyType()

    public fun resourceLocations(): List<String> = unwrap(this).getResourceLocations() ?:
        emptyList()

    public fun resourceType(): String? = unwrap(this).getResourceType()

    public fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

    public fun retainInterval(): Number? = unwrap(this).getRetainInterval()

    public fun schedules(): Any? = unwrap(this).getSchedules()

    public fun targetTags(): Any? = unwrap(this).getTargetTags()

    @CdkDslMarker
    public interface Builder {
      public fun actions(actions: IResolvable)

      public fun actions(actions: List<Any>)

      public fun actions(vararg actions: Any)

      public fun copyTags(copyTags: Boolean)

      public fun copyTags(copyTags: IResolvable)

      public fun createInterval(createInterval: Number)

      public fun crossRegionCopyTargets(crossRegionCopyTargets: Any)

      public fun eventSource(eventSource: IResolvable)

      public fun eventSource(eventSource: EventSourceProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba83ec6e9b31ee2c9c1ff3156958ae645319be35d35de2f973f49684befb2366")
      public fun eventSource(eventSource: EventSourceProperty.Builder.() -> Unit)

      public fun exclusions(exclusions: IResolvable)

      public fun exclusions(exclusions: ExclusionsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23751e6286540ce8214da2c5c32d2b4241adcd6b610e271b7f8c8022ef2e737")
      public fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit)

      public fun extendDeletion(extendDeletion: Boolean)

      public fun extendDeletion(extendDeletion: IResolvable)

      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: ParametersProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6937457773f3f964d1feaeee552709969c224187e8424aedf46a7bdf9a5e6def")
      public fun parameters(parameters: ParametersProperty.Builder.() -> Unit)

      public fun policyLanguage(policyLanguage: String)

      public fun policyType(policyType: String)

      public fun resourceLocations(resourceLocations: List<String>)

      public fun resourceLocations(vararg resourceLocations: String)

      public fun resourceType(resourceType: String)

      public fun resourceTypes(resourceTypes: List<String>)

      public fun resourceTypes(vararg resourceTypes: String)

      public fun retainInterval(retainInterval: Number)

      public fun schedules(schedules: IResolvable)

      public fun schedules(schedules: List<Any>)

      public fun schedules(vararg schedules: Any)

      public fun targetTags(targetTags: IResolvable)

      public fun targetTags(targetTags: List<Any>)

      public fun targetTags(vararg targetTags: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.builder()

      override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: Any): Unit = actions(actions.toList())

      override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      override fun createInterval(createInterval: Number) {
        cdkBuilder.createInterval(createInterval)
      }

      override fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
        cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
      }

      override fun eventSource(eventSource: IResolvable) {
        cdkBuilder.eventSource(eventSource.let(IResolvable::unwrap))
      }

      override fun eventSource(eventSource: EventSourceProperty) {
        cdkBuilder.eventSource(eventSource.let(EventSourceProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba83ec6e9b31ee2c9c1ff3156958ae645319be35d35de2f973f49684befb2366")
      override fun eventSource(eventSource: EventSourceProperty.Builder.() -> Unit): Unit =
          eventSource(EventSourceProperty(eventSource))

      override fun exclusions(exclusions: IResolvable) {
        cdkBuilder.exclusions(exclusions.let(IResolvable::unwrap))
      }

      override fun exclusions(exclusions: ExclusionsProperty) {
        cdkBuilder.exclusions(exclusions.let(ExclusionsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23751e6286540ce8214da2c5c32d2b4241adcd6b610e271b7f8c8022ef2e737")
      override fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit): Unit =
          exclusions(ExclusionsProperty(exclusions))

      override fun extendDeletion(extendDeletion: Boolean) {
        cdkBuilder.extendDeletion(extendDeletion)
      }

      override fun extendDeletion(extendDeletion: IResolvable) {
        cdkBuilder.extendDeletion(extendDeletion.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: ParametersProperty) {
        cdkBuilder.parameters(parameters.let(ParametersProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6937457773f3f964d1feaeee552709969c224187e8424aedf46a7bdf9a5e6def")
      override fun parameters(parameters: ParametersProperty.Builder.() -> Unit): Unit =
          parameters(ParametersProperty(parameters))

      override fun policyLanguage(policyLanguage: String) {
        cdkBuilder.policyLanguage(policyLanguage)
      }

      override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      override fun resourceLocations(resourceLocations: List<String>) {
        cdkBuilder.resourceLocations(resourceLocations)
      }

      override fun resourceLocations(vararg resourceLocations: String): Unit =
          resourceLocations(resourceLocations.toList())

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      override fun resourceTypes(vararg resourceTypes: String): Unit =
          resourceTypes(resourceTypes.toList())

      override fun retainInterval(retainInterval: Number) {
        cdkBuilder.retainInterval(retainInterval)
      }

      override fun schedules(schedules: IResolvable) {
        cdkBuilder.schedules(schedules.let(IResolvable::unwrap))
      }

      override fun schedules(schedules: List<Any>) {
        cdkBuilder.schedules(schedules)
      }

      override fun schedules(vararg schedules: Any): Unit = schedules(schedules.toList())

      override fun targetTags(targetTags: IResolvable) {
        cdkBuilder.targetTags(targetTags.let(IResolvable::unwrap))
      }

      override fun targetTags(targetTags: List<Any>) {
        cdkBuilder.targetTags(targetTags)
      }

      override fun targetTags(vararg targetTags: Any): Unit = targetTags(targetTags.toList())

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty,
    ) : CdkObject(cdkObject), PolicyDetailsProperty {
      override fun actions(): Any? = unwrap(this).getActions()

      override fun copyTags(): Any? = unwrap(this).getCopyTags()

      override fun createInterval(): Number? = unwrap(this).getCreateInterval()

      override fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

      override fun eventSource(): Any? = unwrap(this).getEventSource()

      override fun exclusions(): Any? = unwrap(this).getExclusions()

      override fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

      override fun parameters(): Any? = unwrap(this).getParameters()

      override fun policyLanguage(): String? = unwrap(this).getPolicyLanguage()

      override fun policyType(): String? = unwrap(this).getPolicyType()

      override fun resourceLocations(): List<String> = unwrap(this).getResourceLocations() ?:
          emptyList()

      override fun resourceType(): String? = unwrap(this).getResourceType()

      override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?: emptyList()

      override fun retainInterval(): Number? = unwrap(this).getRetainInterval()

      override fun schedules(): Any? = unwrap(this).getSchedules()

      override fun targetTags(): Any? = unwrap(this).getTargetTags()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty):
          PolicyDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyDetailsProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty
    }
  }

  public interface EncryptionConfigurationProperty {
    public fun cmkArn(): String? = unwrap(this).getCmkArn()

    public fun encrypted(): Any

    @CdkDslMarker
    public interface Builder {
      public fun cmkArn(cmkArn: String)

      public fun encrypted(encrypted: Boolean)

      public fun encrypted(encrypted: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.builder()

      override fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
      }

      override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty,
    ) : CdkObject(cdkObject), EncryptionConfigurationProperty {
      override fun cmkArn(): String? = unwrap(this).getCmkArn()

      override fun encrypted(): Any = unwrap(this).getEncrypted()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty
    }
  }

  public interface CrossRegionCopyActionProperty {
    public fun encryptionConfiguration(): Any

    public fun retainRule(): Any? = unwrap(this).getRetainRule()

    public fun target(): String

    @CdkDslMarker
    public interface Builder {
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ec0c4d606144d14816230ec6cb342ec91c9aef5c6720797c2392ea371d6ffb2")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit)

      public fun retainRule(retainRule: IResolvable)

      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c511487298cb6a01fe90405edf763c8ef3ed3435b1796e0359f3636ce44851")
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit)

      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.builder()

      override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ec0c4d606144d14816230ec6cb342ec91c9aef5c6720797c2392ea371d6ffb2")
      override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(CrossRegionCopyRetainRuleProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c511487298cb6a01fe90405edf763c8ef3ed3435b1796e0359f3636ce44851")
      override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit):
          Unit = retainRule(CrossRegionCopyRetainRuleProperty(retainRule))

      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyActionProperty {
      override fun encryptionConfiguration(): Any = unwrap(this).getEncryptionConfiguration()

      override fun retainRule(): Any? = unwrap(this).getRetainRule()

      override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionCopyActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty):
          CrossRegionCopyActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyActionProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty
    }
  }

  public interface ExclusionsProperty {
    public fun excludeBootVolumes(): Any? = unwrap(this).getExcludeBootVolumes()

    public fun excludeTags(): Any? = unwrap(this).getExcludeTags()

    public fun excludeVolumeTypes(): Any? = unwrap(this).getExcludeVolumeTypes()

    @CdkDslMarker
    public interface Builder {
      public fun excludeBootVolumes(excludeBootVolumes: Boolean)

      public fun excludeBootVolumes(excludeBootVolumes: IResolvable)

      public fun excludeTags(excludeTags: Any)

      public fun excludeVolumeTypes(excludeVolumeTypes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty.builder()

      override fun excludeBootVolumes(excludeBootVolumes: Boolean) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes)
      }

      override fun excludeBootVolumes(excludeBootVolumes: IResolvable) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes.let(IResolvable::unwrap))
      }

      override fun excludeTags(excludeTags: Any) {
        cdkBuilder.excludeTags(excludeTags)
      }

      override fun excludeVolumeTypes(excludeVolumeTypes: Any) {
        cdkBuilder.excludeVolumeTypes(excludeVolumeTypes)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty,
    ) : CdkObject(cdkObject), ExclusionsProperty {
      override fun excludeBootVolumes(): Any? = unwrap(this).getExcludeBootVolumes()

      override fun excludeTags(): Any? = unwrap(this).getExcludeTags()

      override fun excludeVolumeTypes(): Any? = unwrap(this).getExcludeVolumeTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty):
          ExclusionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionsProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty
    }
  }

  public interface ArchiveRetainRuleProperty {
    public fun retentionArchiveTier(): Any

    @CdkDslMarker
    public interface Builder {
      public fun retentionArchiveTier(retentionArchiveTier: IResolvable)

      public fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("551dbf48b425648dc22b6154e42ca2745b9d79670853ce1e7d0b5f107735a6d9")
      public
          fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty.builder()

      override fun retentionArchiveTier(retentionArchiveTier: IResolvable) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier.let(IResolvable::unwrap))
      }

      override fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier.let(RetentionArchiveTierProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("551dbf48b425648dc22b6154e42ca2745b9d79670853ce1e7d0b5f107735a6d9")
      override
          fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty.Builder.() -> Unit):
          Unit = retentionArchiveTier(RetentionArchiveTierProperty(retentionArchiveTier))

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty,
    ) : CdkObject(cdkObject), ArchiveRetainRuleProperty {
      override fun retentionArchiveTier(): Any = unwrap(this).getRetentionArchiveTier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty):
          ArchiveRetainRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty
    }
  }

  public interface CrossRegionCopyRetainRuleProperty {
    public fun interval(): Number

    public fun intervalUnit(): String

    @CdkDslMarker
    public interface Builder {
      public fun interval(interval: Number)

      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.builder()

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty,
    ) : CdkObject(cdkObject), CrossRegionCopyRetainRuleProperty {
      override fun interval(): Number = unwrap(this).getInterval()

      override fun intervalUnit(): String = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CrossRegionCopyRetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty):
          CrossRegionCopyRetainRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyRetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty
    }
  }

  public interface DeprecateRuleProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    @CdkDslMarker
    public interface Builder {
      public fun count(count: Number)

      public fun interval(interval: Number)

      public fun intervalUnit(intervalUnit: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty.builder()

      override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty,
    ) : CdkObject(cdkObject), DeprecateRuleProperty {
      override fun count(): Number? = unwrap(this).getCount()

      override fun interval(): Number? = unwrap(this).getInterval()

      override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DeprecateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty):
          DeprecateRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeprecateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty
    }
  }
}