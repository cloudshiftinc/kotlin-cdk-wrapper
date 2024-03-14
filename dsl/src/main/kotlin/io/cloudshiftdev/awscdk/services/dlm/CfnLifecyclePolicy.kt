package io.cloudshiftdev.awscdk.services.dlm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLifecyclePolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun copyTags(copyTags: Boolean) {
    }

    public fun copyTags(copyTags: IResolvable) {
    }

    public fun createInterval(createInterval: Number) {
    }

    public fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
    }

    public fun defaultPolicy(defaultPolicy: String) {
    }

    public fun description(description: String) {
    }

    public fun exclusions(exclusions: IResolvable) {
    }

    public fun exclusions(exclusions: ExclusionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("417e5709901c173f3458bad230ac75cfff8db50ed3b536d683412a8e62a76d22")
    public fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit) {
    }

    public fun executionRoleArn(executionRoleArn: String) {
    }

    public fun extendDeletion(extendDeletion: Boolean) {
    }

    public fun extendDeletion(extendDeletion: IResolvable) {
    }

    public fun policyDetails(policyDetails: IResolvable) {
    }

    public fun policyDetails(policyDetails: PolicyDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddf21f53e23f44a93e1aa8317fd8f4e69e074d10761bd83c4869006ef3c64f76")
    public fun policyDetails(policyDetails: PolicyDetailsProperty.Builder.() -> Unit) {
    }

    public fun retainInterval(retainInterval: Number) {
    }

    public fun state(state: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.Builder =
        software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.Builder.create(scope, id)

    public override fun copyTags(copyTags: Boolean) {
      cdkBuilder.copyTags(copyTags)
    }

    public override fun copyTags(copyTags: IResolvable) {
      cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
    }

    public override fun createInterval(createInterval: Number) {
      cdkBuilder.createInterval(createInterval)
    }

    public override fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
      cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
    }

    public override fun defaultPolicy(defaultPolicy: String) {
      cdkBuilder.defaultPolicy(defaultPolicy)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun exclusions(exclusions: IResolvable) {
      cdkBuilder.exclusions(exclusions.let(IResolvable::unwrap))
    }

    public override fun exclusions(exclusions: ExclusionsProperty) {
      cdkBuilder.exclusions(exclusions.let(ExclusionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("417e5709901c173f3458bad230ac75cfff8db50ed3b536d683412a8e62a76d22")
    public override fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit): Unit =
        exclusions(ExclusionsProperty(exclusions))

    public override fun executionRoleArn(executionRoleArn: String) {
      cdkBuilder.executionRoleArn(executionRoleArn)
    }

    public override fun extendDeletion(extendDeletion: Boolean) {
      cdkBuilder.extendDeletion(extendDeletion)
    }

    public override fun extendDeletion(extendDeletion: IResolvable) {
      cdkBuilder.extendDeletion(extendDeletion.let(IResolvable::unwrap))
    }

    public override fun policyDetails(policyDetails: IResolvable) {
      cdkBuilder.policyDetails(policyDetails.let(IResolvable::unwrap))
    }

    public override fun policyDetails(policyDetails: PolicyDetailsProperty) {
      cdkBuilder.policyDetails(policyDetails.let(PolicyDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ddf21f53e23f44a93e1aa8317fd8f4e69e074d10761bd83c4869006ef3c64f76")
    public override fun policyDetails(policyDetails: PolicyDetailsProperty.Builder.() -> Unit): Unit
        = policyDetails(PolicyDetailsProperty(policyDetails))

    public override fun retainInterval(retainInterval: Number) {
      cdkBuilder.retainInterval(retainInterval)
    }

    public override fun state(state: String) {
      cdkBuilder.state(state)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun count(count: Number) {
      }

      public fun interval(interval: Number) {
      }

      public fun intervalUnit(intervalUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty.builder()

      public override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty,
    ) : RetainRuleProperty {
      public override fun count(): Number? = unwrap(this).getCount()

      public override fun interval(): Number? = unwrap(this).getInterval()

      public override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty):
          RetainRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventParametersProperty {
    public fun descriptionRegex(): String? = unwrap(this).getDescriptionRegex()

    public fun eventType(): String

    public fun snapshotOwner(): List<String>

    public interface Builder {
      public fun descriptionRegex(descriptionRegex: String) {
      }

      public fun eventType(eventType: String) {
      }

      public fun snapshotOwner(snapshotOwner: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty.builder()

      public override fun descriptionRegex(descriptionRegex: String) {
        cdkBuilder.descriptionRegex(descriptionRegex)
      }

      public override fun eventType(eventType: String) {
        cdkBuilder.eventType(eventType)
      }

      public override fun snapshotOwner(snapshotOwner: List<String>) {
        cdkBuilder.snapshotOwner(snapshotOwner)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty,
    ) : EventParametersProperty {
      public override fun descriptionRegex(): String? = unwrap(this).getDescriptionRegex()

      public override fun eventType(): String = unwrap(this).getEventType()

      public override fun snapshotOwner(): List<String> = unwrap(this).getSnapshotOwner() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty):
          EventParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventParametersProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ActionProperty {
    public fun crossRegionCopy(): Any

    public fun name(): String

    public interface Builder {
      public fun crossRegionCopy(crossRegionCopy: IResolvable) {
      }

      public fun crossRegionCopy(crossRegionCopy: List<Any>) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty.builder()

      public override fun crossRegionCopy(crossRegionCopy: IResolvable) {
        cdkBuilder.crossRegionCopy(crossRegionCopy.let(IResolvable::unwrap))
      }

      public override fun crossRegionCopy(crossRegionCopy: List<Any>) {
        cdkBuilder.crossRegionCopy(crossRegionCopy)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty,
    ) : ActionProperty {
      public override fun crossRegionCopy(): Any = unwrap(this).getCrossRegionCopy()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ParametersProperty {
    public fun excludeBootVolume(): Any? = unwrap(this).getExcludeBootVolume()

    public fun excludeDataVolumeTags(): Any? = unwrap(this).getExcludeDataVolumeTags()

    public fun noReboot(): Any? = unwrap(this).getNoReboot()

    public interface Builder {
      public fun excludeBootVolume(excludeBootVolume: Boolean) {
      }

      public fun excludeBootVolume(excludeBootVolume: IResolvable) {
      }

      public fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable) {
      }

      public fun excludeDataVolumeTags(excludeDataVolumeTags: List<Any>) {
      }

      public fun noReboot(noReboot: Boolean) {
      }

      public fun noReboot(noReboot: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty.builder()

      public override fun excludeBootVolume(excludeBootVolume: Boolean) {
        cdkBuilder.excludeBootVolume(excludeBootVolume)
      }

      public override fun excludeBootVolume(excludeBootVolume: IResolvable) {
        cdkBuilder.excludeBootVolume(excludeBootVolume.let(IResolvable::unwrap))
      }

      public override fun excludeDataVolumeTags(excludeDataVolumeTags: IResolvable) {
        cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags.let(IResolvable::unwrap))
      }

      public override fun excludeDataVolumeTags(excludeDataVolumeTags: List<Any>) {
        cdkBuilder.excludeDataVolumeTags(excludeDataVolumeTags)
      }

      public override fun noReboot(noReboot: Boolean) {
        cdkBuilder.noReboot(noReboot)
      }

      public override fun noReboot(noReboot: IResolvable) {
        cdkBuilder.noReboot(noReboot.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty,
    ) : ParametersProperty {
      public override fun excludeBootVolume(): Any? = unwrap(this).getExcludeBootVolume()

      public override fun excludeDataVolumeTags(): Any? = unwrap(this).getExcludeDataVolumeTags()

      public override fun noReboot(): Any? = unwrap(this).getNoReboot()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty):
          ParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParametersProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ParametersProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventSourceProperty {
    public fun parameters(): Any? = unwrap(this).getParameters()

    public fun type(): String

    public interface Builder {
      public fun parameters(parameters: IResolvable) {
      }

      public fun parameters(parameters: EventParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1a8456c119a6ab5e78a9fe2209d5e66ecc1d392e84cfbb43a437e6349e6d39")
      public fun parameters(parameters: EventParametersProperty.Builder.() -> Unit) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty.builder()

      public override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      public override fun parameters(parameters: EventParametersProperty) {
        cdkBuilder.parameters(parameters.let(EventParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca1a8456c119a6ab5e78a9fe2209d5e66ecc1d392e84cfbb43a437e6349e6d39")
      public override fun parameters(parameters: EventParametersProperty.Builder.() -> Unit): Unit =
          parameters(EventParametersProperty(parameters))

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty,
    ) : EventSourceProperty {
      public override fun parameters(): Any? = unwrap(this).getParameters()

      public override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty):
          EventSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventSourceProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EventSourceProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CrossRegionCopyDeprecateRuleProperty {
    public fun interval(): Number

    public fun intervalUnit(): String

    public interface Builder {
      public fun interval(interval: Number) {
      }

      public fun intervalUnit(intervalUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty.builder()

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyDeprecateRuleProperty,
    ) : CrossRegionCopyDeprecateRuleProperty {
      public override fun interval(): Number = unwrap(this).getInterval()

      public override fun intervalUnit(): String = unwrap(this).getIntervalUnit()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ShareRuleProperty {
    public fun targetAccounts(): List<String> = unwrap(this).getTargetAccounts() ?: emptyList()

    public fun unshareInterval(): Number? = unwrap(this).getUnshareInterval()

    public fun unshareIntervalUnit(): String? = unwrap(this).getUnshareIntervalUnit()

    public interface Builder {
      public fun targetAccounts(targetAccounts: List<String>) {
      }

      public fun unshareInterval(unshareInterval: Number) {
      }

      public fun unshareIntervalUnit(unshareIntervalUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty.builder()

      public override fun targetAccounts(targetAccounts: List<String>) {
        cdkBuilder.targetAccounts(targetAccounts)
      }

      public override fun unshareInterval(unshareInterval: Number) {
        cdkBuilder.unshareInterval(unshareInterval)
      }

      public override fun unshareIntervalUnit(unshareIntervalUnit: String) {
        cdkBuilder.unshareIntervalUnit(unshareIntervalUnit)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty,
    ) : ShareRuleProperty {
      public override fun targetAccounts(): List<String> = unwrap(this).getTargetAccounts() ?:
          emptyList()

      public override fun unshareInterval(): Number? = unwrap(this).getUnshareInterval()

      public override fun unshareIntervalUnit(): String? = unwrap(this).getUnshareIntervalUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ShareRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty):
          ShareRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShareRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ShareRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FastRestoreRuleProperty {
    public fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
        emptyList()

    public fun count(): Number? = unwrap(this).getCount()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    public interface Builder {
      public fun availabilityZones(availabilityZones: List<String>) {
      }

      public fun count(count: Number) {
      }

      public fun interval(interval: Number) {
      }

      public fun intervalUnit(intervalUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty.builder()

      public override fun availabilityZones(availabilityZones: List<String>) {
        cdkBuilder.availabilityZones(availabilityZones)
      }

      public override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty,
    ) : FastRestoreRuleProperty {
      public override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones() ?:
          emptyList()

      public override fun count(): Number? = unwrap(this).getCount()

      public override fun interval(): Number? = unwrap(this).getInterval()

      public override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FastRestoreRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty):
          FastRestoreRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastRestoreRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RetentionArchiveTierProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    public interface Builder {
      public fun count(count: Number) {
      }

      public fun interval(interval: Number) {
      }

      public fun intervalUnit(intervalUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty.builder()

      public override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty,
    ) : RetentionArchiveTierProperty {
      public override fun count(): Number? = unwrap(this).getCount()

      public override fun interval(): Number? = unwrap(this).getInterval()

      public override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RetentionArchiveTierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty):
          RetentionArchiveTierProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetentionArchiveTierProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetentionArchiveTierProperty =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun archiveRule(archiveRule: IResolvable) {
      }

      public fun archiveRule(archiveRule: ArchiveRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825dead620cc6ea08a641afcd158f0cc401bd80dfd5c87605bacaf652b0ce3a1")
      public fun archiveRule(archiveRule: ArchiveRuleProperty.Builder.() -> Unit) {
      }

      public fun copyTags(copyTags: Boolean) {
      }

      public fun copyTags(copyTags: IResolvable) {
      }

      public fun createRule(createRule: IResolvable) {
      }

      public fun createRule(createRule: CreateRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54891bc79136e1c87930dfbd441d43e610d3d82bccfced6e1bdf038d422a97b8")
      public fun createRule(createRule: CreateRuleProperty.Builder.() -> Unit) {
      }

      public fun crossRegionCopyRules(crossRegionCopyRules: IResolvable) {
      }

      public fun crossRegionCopyRules(crossRegionCopyRules: List<Any>) {
      }

      public fun deprecateRule(deprecateRule: IResolvable) {
      }

      public fun deprecateRule(deprecateRule: DeprecateRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb7a0258a6a743ee09f1b22132dea6f3341e66f8726bb797909b7292faed4270")
      public fun deprecateRule(deprecateRule: DeprecateRuleProperty.Builder.() -> Unit) {
      }

      public fun fastRestoreRule(fastRestoreRule: IResolvable) {
      }

      public fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e27b9391e7a38b3c973427c0f60208402a121bef2c15bbc3199f4c686769530a")
      public fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty.Builder.() -> Unit) {
      }

      public fun name(name: String) {
      }

      public fun retainRule(retainRule: IResolvable) {
      }

      public fun retainRule(retainRule: RetainRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98893537e56c00100b0f8d465996d0e9a2d0071e41103b84fb051fa0820b0529")
      public fun retainRule(retainRule: RetainRuleProperty.Builder.() -> Unit) {
      }

      public fun shareRules(shareRules: IResolvable) {
      }

      public fun shareRules(shareRules: List<Any>) {
      }

      public fun tagsToAdd(tagsToAdd: IResolvable) {
      }

      public fun tagsToAdd(tagsToAdd: List<Any>) {
      }

      public fun variableTags(variableTags: IResolvable) {
      }

      public fun variableTags(variableTags: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.builder()

      public override fun archiveRule(archiveRule: IResolvable) {
        cdkBuilder.archiveRule(archiveRule.let(IResolvable::unwrap))
      }

      public override fun archiveRule(archiveRule: ArchiveRuleProperty) {
        cdkBuilder.archiveRule(archiveRule.let(ArchiveRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("825dead620cc6ea08a641afcd158f0cc401bd80dfd5c87605bacaf652b0ce3a1")
      public override fun archiveRule(archiveRule: ArchiveRuleProperty.Builder.() -> Unit): Unit =
          archiveRule(ArchiveRuleProperty(archiveRule))

      public override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      public override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      public override fun createRule(createRule: IResolvable) {
        cdkBuilder.createRule(createRule.let(IResolvable::unwrap))
      }

      public override fun createRule(createRule: CreateRuleProperty) {
        cdkBuilder.createRule(createRule.let(CreateRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54891bc79136e1c87930dfbd441d43e610d3d82bccfced6e1bdf038d422a97b8")
      public override fun createRule(createRule: CreateRuleProperty.Builder.() -> Unit): Unit =
          createRule(CreateRuleProperty(createRule))

      public override fun crossRegionCopyRules(crossRegionCopyRules: IResolvable) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules.let(IResolvable::unwrap))
      }

      public override fun crossRegionCopyRules(crossRegionCopyRules: List<Any>) {
        cdkBuilder.crossRegionCopyRules(crossRegionCopyRules)
      }

      public override fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule.let(IResolvable::unwrap))
      }

      public override fun deprecateRule(deprecateRule: DeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule.let(DeprecateRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb7a0258a6a743ee09f1b22132dea6f3341e66f8726bb797909b7292faed4270")
      public override fun deprecateRule(deprecateRule: DeprecateRuleProperty.Builder.() -> Unit):
          Unit = deprecateRule(DeprecateRuleProperty(deprecateRule))

      public override fun fastRestoreRule(fastRestoreRule: IResolvable) {
        cdkBuilder.fastRestoreRule(fastRestoreRule.let(IResolvable::unwrap))
      }

      public override fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty) {
        cdkBuilder.fastRestoreRule(fastRestoreRule.let(FastRestoreRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e27b9391e7a38b3c973427c0f60208402a121bef2c15bbc3199f4c686769530a")
      public override
          fun fastRestoreRule(fastRestoreRule: FastRestoreRuleProperty.Builder.() -> Unit): Unit =
          fastRestoreRule(FastRestoreRuleProperty(fastRestoreRule))

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      public override fun retainRule(retainRule: RetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(RetainRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("98893537e56c00100b0f8d465996d0e9a2d0071e41103b84fb051fa0820b0529")
      public override fun retainRule(retainRule: RetainRuleProperty.Builder.() -> Unit): Unit =
          retainRule(RetainRuleProperty(retainRule))

      public override fun shareRules(shareRules: IResolvable) {
        cdkBuilder.shareRules(shareRules.let(IResolvable::unwrap))
      }

      public override fun shareRules(shareRules: List<Any>) {
        cdkBuilder.shareRules(shareRules)
      }

      public override fun tagsToAdd(tagsToAdd: IResolvable) {
        cdkBuilder.tagsToAdd(tagsToAdd.let(IResolvable::unwrap))
      }

      public override fun tagsToAdd(tagsToAdd: List<Any>) {
        cdkBuilder.tagsToAdd(tagsToAdd)
      }

      public override fun variableTags(variableTags: IResolvable) {
        cdkBuilder.variableTags(variableTags.let(IResolvable::unwrap))
      }

      public override fun variableTags(variableTags: List<Any>) {
        cdkBuilder.variableTags(variableTags)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty,
    ) : ScheduleProperty {
      public override fun archiveRule(): Any? = unwrap(this).getArchiveRule()

      public override fun copyTags(): Any? = unwrap(this).getCopyTags()

      public override fun createRule(): Any? = unwrap(this).getCreateRule()

      public override fun crossRegionCopyRules(): Any? = unwrap(this).getCrossRegionCopyRules()

      public override fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

      public override fun fastRestoreRule(): Any? = unwrap(this).getFastRestoreRule()

      public override fun name(): String? = unwrap(this).getName()

      public override fun retainRule(): Any? = unwrap(this).getRetainRule()

      public override fun shareRules(): Any? = unwrap(this).getShareRules()

      public override fun tagsToAdd(): Any? = unwrap(this).getTagsToAdd()

      public override fun variableTags(): Any? = unwrap(this).getVariableTags()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ArchiveRuleProperty {
    public fun retainRule(): Any

    public interface Builder {
      public fun retainRule(retainRule: IResolvable) {
      }

      public fun retainRule(retainRule: ArchiveRetainRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22112598039fa0891c015794eab927b32a7c3cace5a3606f9960cb6a144f4b1e")
      public fun retainRule(retainRule: ArchiveRetainRuleProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty.builder()

      public override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      public override fun retainRule(retainRule: ArchiveRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(ArchiveRetainRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("22112598039fa0891c015794eab927b32a7c3cace5a3606f9960cb6a144f4b1e")
      public override fun retainRule(retainRule: ArchiveRetainRuleProperty.Builder.() -> Unit): Unit
          = retainRule(ArchiveRetainRuleProperty(retainRule))

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty,
    ) : ArchiveRuleProperty {
      public override fun retainRule(): Any = unwrap(this).getRetainRule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty):
          ArchiveRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CreateRuleProperty {
    public fun cronExpression(): String? = unwrap(this).getCronExpression()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    public fun location(): String? = unwrap(this).getLocation()

    public fun scripts(): Any? = unwrap(this).getScripts()

    public fun times(): List<String> = unwrap(this).getTimes() ?: emptyList()

    public interface Builder {
      public fun cronExpression(cronExpression: String) {
      }

      public fun interval(interval: Number) {
      }

      public fun intervalUnit(intervalUnit: String) {
      }

      public fun location(location: String) {
      }

      public fun scripts(scripts: IResolvable) {
      }

      public fun scripts(scripts: List<Any>) {
      }

      public fun times(times: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty.builder()

      public override fun cronExpression(cronExpression: String) {
        cdkBuilder.cronExpression(cronExpression)
      }

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public override fun location(location: String) {
        cdkBuilder.location(location)
      }

      public override fun scripts(scripts: IResolvable) {
        cdkBuilder.scripts(scripts.let(IResolvable::unwrap))
      }

      public override fun scripts(scripts: List<Any>) {
        cdkBuilder.scripts(scripts)
      }

      public override fun times(times: List<String>) {
        cdkBuilder.times(times)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty,
    ) : CreateRuleProperty {
      public override fun cronExpression(): String? = unwrap(this).getCronExpression()

      public override fun interval(): Number? = unwrap(this).getInterval()

      public override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

      public override fun location(): String? = unwrap(this).getLocation()

      public override fun scripts(): Any? = unwrap(this).getScripts()

      public override fun times(): List<String> = unwrap(this).getTimes() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CreateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty):
          CreateRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: Boolean) {
      }

      public fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: IResolvable) {
      }

      public fun executionHandler(executionHandler: String) {
      }

      public fun executionHandlerService(executionHandlerService: String) {
      }

      public fun executionTimeout(executionTimeout: Number) {
      }

      public fun maximumRetryCount(maximumRetryCount: Number) {
      }

      public fun stages(stages: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty.builder()

      public override
          fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: Boolean) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure)
      }

      public override
          fun executeOperationOnScriptFailure(executeOperationOnScriptFailure: IResolvable) {
        cdkBuilder.executeOperationOnScriptFailure(executeOperationOnScriptFailure.let(IResolvable::unwrap))
      }

      public override fun executionHandler(executionHandler: String) {
        cdkBuilder.executionHandler(executionHandler)
      }

      public override fun executionHandlerService(executionHandlerService: String) {
        cdkBuilder.executionHandlerService(executionHandlerService)
      }

      public override fun executionTimeout(executionTimeout: Number) {
        cdkBuilder.executionTimeout(executionTimeout)
      }

      public override fun maximumRetryCount(maximumRetryCount: Number) {
        cdkBuilder.maximumRetryCount(maximumRetryCount)
      }

      public override fun stages(stages: List<String>) {
        cdkBuilder.stages(stages)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty,
    ) : ScriptProperty {
      public override fun executeOperationOnScriptFailure(): Any? =
          unwrap(this).getExecuteOperationOnScriptFailure()

      public override fun executionHandler(): String? = unwrap(this).getExecutionHandler()

      public override fun executionHandlerService(): String? =
          unwrap(this).getExecutionHandlerService()

      public override fun executionTimeout(): Number? = unwrap(this).getExecutionTimeout()

      public override fun maximumRetryCount(): Number? = unwrap(this).getMaximumRetryCount()

      public override fun stages(): List<String> = unwrap(this).getStages() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScriptProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty):
          ScriptProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScriptProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScriptProperty = (wrapped as
          Wrapper).cdkObject
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

    public interface Builder {
      public fun cmkArn(cmkArn: String) {
      }

      public fun copyTags(copyTags: Boolean) {
      }

      public fun copyTags(copyTags: IResolvable) {
      }

      public fun deprecateRule(deprecateRule: IResolvable) {
      }

      public fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e611e77205c99955185e3196c511607f8e5072ade57cabcd9b0cb66b22ae65")
      public
          fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty.Builder.() -> Unit) {
      }

      public fun encrypted(encrypted: Boolean) {
      }

      public fun encrypted(encrypted: IResolvable) {
      }

      public fun retainRule(retainRule: IResolvable) {
      }

      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("167e01da92a571d38b2ea00ebe7df6e195e691b240f448676b5a2ca926bbda1d")
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit) {
      }

      public fun target(target: String) {
      }

      public fun targetRegion(targetRegion: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty.builder()

      public override fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
      }

      public override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      public override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      public override fun deprecateRule(deprecateRule: IResolvable) {
        cdkBuilder.deprecateRule(deprecateRule.let(IResolvable::unwrap))
      }

      public override fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty) {
        cdkBuilder.deprecateRule(deprecateRule.let(CrossRegionCopyDeprecateRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("03e611e77205c99955185e3196c511607f8e5072ade57cabcd9b0cb66b22ae65")
      public override
          fun deprecateRule(deprecateRule: CrossRegionCopyDeprecateRuleProperty.Builder.() -> Unit):
          Unit = deprecateRule(CrossRegionCopyDeprecateRuleProperty(deprecateRule))

      public override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      public override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      public override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      public override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(CrossRegionCopyRetainRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("167e01da92a571d38b2ea00ebe7df6e195e691b240f448676b5a2ca926bbda1d")
      public override
          fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit): Unit =
          retainRule(CrossRegionCopyRetainRuleProperty(retainRule))

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public override fun targetRegion(targetRegion: String) {
        cdkBuilder.targetRegion(targetRegion)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty,
    ) : CrossRegionCopyRuleProperty {
      public override fun cmkArn(): String? = unwrap(this).getCmkArn()

      public override fun copyTags(): Any? = unwrap(this).getCopyTags()

      public override fun deprecateRule(): Any? = unwrap(this).getDeprecateRule()

      public override fun encrypted(): Any = unwrap(this).getEncrypted()

      public override fun retainRule(): Any? = unwrap(this).getRetainRule()

      public override fun target(): String? = unwrap(this).getTarget()

      public override fun targetRegion(): String? = unwrap(this).getTargetRegion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionCopyRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty):
          CrossRegionCopyRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRuleProperty =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun actions(actions: IResolvable) {
      }

      public fun actions(actions: List<Any>) {
      }

      public fun copyTags(copyTags: Boolean) {
      }

      public fun copyTags(copyTags: IResolvable) {
      }

      public fun createInterval(createInterval: Number) {
      }

      public fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
      }

      public fun eventSource(eventSource: IResolvable) {
      }

      public fun eventSource(eventSource: EventSourceProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba83ec6e9b31ee2c9c1ff3156958ae645319be35d35de2f973f49684befb2366")
      public fun eventSource(eventSource: EventSourceProperty.Builder.() -> Unit) {
      }

      public fun exclusions(exclusions: IResolvable) {
      }

      public fun exclusions(exclusions: ExclusionsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23751e6286540ce8214da2c5c32d2b4241adcd6b610e271b7f8c8022ef2e737")
      public fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit) {
      }

      public fun extendDeletion(extendDeletion: Boolean) {
      }

      public fun extendDeletion(extendDeletion: IResolvable) {
      }

      public fun parameters(parameters: IResolvable) {
      }

      public fun parameters(parameters: ParametersProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6937457773f3f964d1feaeee552709969c224187e8424aedf46a7bdf9a5e6def")
      public fun parameters(parameters: ParametersProperty.Builder.() -> Unit) {
      }

      public fun policyLanguage(policyLanguage: String) {
      }

      public fun policyType(policyType: String) {
      }

      public fun resourceLocations(resourceLocations: List<String>) {
      }

      public fun resourceType(resourceType: String) {
      }

      public fun resourceTypes(resourceTypes: List<String>) {
      }

      public fun retainInterval(retainInterval: Number) {
      }

      public fun schedules(schedules: IResolvable) {
      }

      public fun schedules(schedules: List<Any>) {
      }

      public fun targetTags(targetTags: IResolvable) {
      }

      public fun targetTags(targetTags: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty.builder()

      public override fun actions(actions: IResolvable) {
        cdkBuilder.actions(actions.let(IResolvable::unwrap))
      }

      public override fun actions(actions: List<Any>) {
        cdkBuilder.actions(actions)
      }

      public override fun copyTags(copyTags: Boolean) {
        cdkBuilder.copyTags(copyTags)
      }

      public override fun copyTags(copyTags: IResolvable) {
        cdkBuilder.copyTags(copyTags.let(IResolvable::unwrap))
      }

      public override fun createInterval(createInterval: Number) {
        cdkBuilder.createInterval(createInterval)
      }

      public override fun crossRegionCopyTargets(crossRegionCopyTargets: Any) {
        cdkBuilder.crossRegionCopyTargets(crossRegionCopyTargets)
      }

      public override fun eventSource(eventSource: IResolvable) {
        cdkBuilder.eventSource(eventSource.let(IResolvable::unwrap))
      }

      public override fun eventSource(eventSource: EventSourceProperty) {
        cdkBuilder.eventSource(eventSource.let(EventSourceProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ba83ec6e9b31ee2c9c1ff3156958ae645319be35d35de2f973f49684befb2366")
      public override fun eventSource(eventSource: EventSourceProperty.Builder.() -> Unit): Unit =
          eventSource(EventSourceProperty(eventSource))

      public override fun exclusions(exclusions: IResolvable) {
        cdkBuilder.exclusions(exclusions.let(IResolvable::unwrap))
      }

      public override fun exclusions(exclusions: ExclusionsProperty) {
        cdkBuilder.exclusions(exclusions.let(ExclusionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a23751e6286540ce8214da2c5c32d2b4241adcd6b610e271b7f8c8022ef2e737")
      public override fun exclusions(exclusions: ExclusionsProperty.Builder.() -> Unit): Unit =
          exclusions(ExclusionsProperty(exclusions))

      public override fun extendDeletion(extendDeletion: Boolean) {
        cdkBuilder.extendDeletion(extendDeletion)
      }

      public override fun extendDeletion(extendDeletion: IResolvable) {
        cdkBuilder.extendDeletion(extendDeletion.let(IResolvable::unwrap))
      }

      public override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      public override fun parameters(parameters: ParametersProperty) {
        cdkBuilder.parameters(parameters.let(ParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6937457773f3f964d1feaeee552709969c224187e8424aedf46a7bdf9a5e6def")
      public override fun parameters(parameters: ParametersProperty.Builder.() -> Unit): Unit =
          parameters(ParametersProperty(parameters))

      public override fun policyLanguage(policyLanguage: String) {
        cdkBuilder.policyLanguage(policyLanguage)
      }

      public override fun policyType(policyType: String) {
        cdkBuilder.policyType(policyType)
      }

      public override fun resourceLocations(resourceLocations: List<String>) {
        cdkBuilder.resourceLocations(resourceLocations)
      }

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public override fun resourceTypes(resourceTypes: List<String>) {
        cdkBuilder.resourceTypes(resourceTypes)
      }

      public override fun retainInterval(retainInterval: Number) {
        cdkBuilder.retainInterval(retainInterval)
      }

      public override fun schedules(schedules: IResolvable) {
        cdkBuilder.schedules(schedules.let(IResolvable::unwrap))
      }

      public override fun schedules(schedules: List<Any>) {
        cdkBuilder.schedules(schedules)
      }

      public override fun targetTags(targetTags: IResolvable) {
        cdkBuilder.targetTags(targetTags.let(IResolvable::unwrap))
      }

      public override fun targetTags(targetTags: List<Any>) {
        cdkBuilder.targetTags(targetTags)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty,
    ) : PolicyDetailsProperty {
      public override fun actions(): Any? = unwrap(this).getActions()

      public override fun copyTags(): Any? = unwrap(this).getCopyTags()

      public override fun createInterval(): Number? = unwrap(this).getCreateInterval()

      public override fun crossRegionCopyTargets(): Any? = unwrap(this).getCrossRegionCopyTargets()

      public override fun eventSource(): Any? = unwrap(this).getEventSource()

      public override fun exclusions(): Any? = unwrap(this).getExclusions()

      public override fun extendDeletion(): Any? = unwrap(this).getExtendDeletion()

      public override fun parameters(): Any? = unwrap(this).getParameters()

      public override fun policyLanguage(): String? = unwrap(this).getPolicyLanguage()

      public override fun policyType(): String? = unwrap(this).getPolicyType()

      public override fun resourceLocations(): List<String> = unwrap(this).getResourceLocations() ?:
          emptyList()

      public override fun resourceType(): String? = unwrap(this).getResourceType()

      public override fun resourceTypes(): List<String> = unwrap(this).getResourceTypes() ?:
          emptyList()

      public override fun retainInterval(): Number? = unwrap(this).getRetainInterval()

      public override fun schedules(): Any? = unwrap(this).getSchedules()

      public override fun targetTags(): Any? = unwrap(this).getTargetTags()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty):
          PolicyDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyDetailsProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.PolicyDetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EncryptionConfigurationProperty {
    public fun cmkArn(): String? = unwrap(this).getCmkArn()

    public fun encrypted(): Any

    public interface Builder {
      public fun cmkArn(cmkArn: String) {
      }

      public fun encrypted(encrypted: Boolean) {
      }

      public fun encrypted(encrypted: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty.builder()

      public override fun cmkArn(cmkArn: String) {
        cdkBuilder.cmkArn(cmkArn)
      }

      public override fun encrypted(encrypted: Boolean) {
        cdkBuilder.encrypted(encrypted)
      }

      public override fun encrypted(encrypted: IResolvable) {
        cdkBuilder.encrypted(encrypted.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty,
    ) : EncryptionConfigurationProperty {
      public override fun cmkArn(): String? = unwrap(this).getCmkArn()

      public override fun encrypted(): Any = unwrap(this).getEncrypted()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty):
          EncryptionConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigurationProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.EncryptionConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CrossRegionCopyActionProperty {
    public fun encryptionConfiguration(): Any

    public fun retainRule(): Any? = unwrap(this).getRetainRule()

    public fun target(): String

    public interface Builder {
      public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      }

      public fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ec0c4d606144d14816230ec6cb342ec91c9aef5c6720797c2392ea371d6ffb2")
      public
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit) {
      }

      public fun retainRule(retainRule: IResolvable) {
      }

      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c511487298cb6a01fe90405edf763c8ef3ed3435b1796e0359f3636ce44851")
      public fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit) {
      }

      public fun target(target: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty.builder()

      public override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable::unwrap))
      }

      public override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(EncryptionConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2ec0c4d606144d14816230ec6cb342ec91c9aef5c6720797c2392ea371d6ffb2")
      public override
          fun encryptionConfiguration(encryptionConfiguration: EncryptionConfigurationProperty.Builder.() -> Unit):
          Unit = encryptionConfiguration(EncryptionConfigurationProperty(encryptionConfiguration))

      public override fun retainRule(retainRule: IResolvable) {
        cdkBuilder.retainRule(retainRule.let(IResolvable::unwrap))
      }

      public override fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty) {
        cdkBuilder.retainRule(retainRule.let(CrossRegionCopyRetainRuleProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("01c511487298cb6a01fe90405edf763c8ef3ed3435b1796e0359f3636ce44851")
      public override
          fun retainRule(retainRule: CrossRegionCopyRetainRuleProperty.Builder.() -> Unit): Unit =
          retainRule(CrossRegionCopyRetainRuleProperty(retainRule))

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty,
    ) : CrossRegionCopyActionProperty {
      public override fun encryptionConfiguration(): Any = unwrap(this).getEncryptionConfiguration()

      public override fun retainRule(): Any? = unwrap(this).getRetainRule()

      public override fun target(): String = unwrap(this).getTarget()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CrossRegionCopyActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty):
          CrossRegionCopyActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CrossRegionCopyActionProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyActionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ExclusionsProperty {
    public fun excludeBootVolumes(): Any? = unwrap(this).getExcludeBootVolumes()

    public fun excludeTags(): Any? = unwrap(this).getExcludeTags()

    public fun excludeVolumeTypes(): Any? = unwrap(this).getExcludeVolumeTypes()

    public interface Builder {
      public fun excludeBootVolumes(excludeBootVolumes: Boolean) {
      }

      public fun excludeBootVolumes(excludeBootVolumes: IResolvable) {
      }

      public fun excludeTags(excludeTags: Any) {
      }

      public fun excludeVolumeTypes(excludeVolumeTypes: Any) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty.builder()

      public override fun excludeBootVolumes(excludeBootVolumes: Boolean) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes)
      }

      public override fun excludeBootVolumes(excludeBootVolumes: IResolvable) {
        cdkBuilder.excludeBootVolumes(excludeBootVolumes.let(IResolvable::unwrap))
      }

      public override fun excludeTags(excludeTags: Any) {
        cdkBuilder.excludeTags(excludeTags)
      }

      public override fun excludeVolumeTypes(excludeVolumeTypes: Any) {
        cdkBuilder.excludeVolumeTypes(excludeVolumeTypes)
      }

      public fun build(): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty,
    ) : ExclusionsProperty {
      public override fun excludeBootVolumes(): Any? = unwrap(this).getExcludeBootVolumes()

      public override fun excludeTags(): Any? = unwrap(this).getExcludeTags()

      public override fun excludeVolumeTypes(): Any? = unwrap(this).getExcludeVolumeTypes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ExclusionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty):
          ExclusionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExclusionsProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ExclusionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ArchiveRetainRuleProperty {
    public fun retentionArchiveTier(): Any

    public interface Builder {
      public fun retentionArchiveTier(retentionArchiveTier: IResolvable) {
      }

      public fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("551dbf48b425648dc22b6154e42ca2745b9d79670853ce1e7d0b5f107735a6d9")
      public
          fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty.builder()

      public override fun retentionArchiveTier(retentionArchiveTier: IResolvable) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier.let(IResolvable::unwrap))
      }

      public override fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty) {
        cdkBuilder.retentionArchiveTier(retentionArchiveTier.let(RetentionArchiveTierProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("551dbf48b425648dc22b6154e42ca2745b9d79670853ce1e7d0b5f107735a6d9")
      public override
          fun retentionArchiveTier(retentionArchiveTier: RetentionArchiveTierProperty.Builder.() -> Unit):
          Unit = retentionArchiveTier(RetentionArchiveTierProperty(retentionArchiveTier))

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty,
    ) : ArchiveRetainRuleProperty {
      public override fun retentionArchiveTier(): Any = unwrap(this).getRetentionArchiveTier()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ArchiveRetainRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty):
          ArchiveRetainRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ArchiveRetainRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ArchiveRetainRuleProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CrossRegionCopyRetainRuleProperty {
    public fun interval(): Number

    public fun intervalUnit(): String

    public interface Builder {
      public fun interval(interval: Number) {
      }

      public fun intervalUnit(intervalUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.Builder
          =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty.builder()

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CrossRegionCopyRetainRuleProperty,
    ) : CrossRegionCopyRetainRuleProperty {
      public override fun interval(): Number = unwrap(this).getInterval()

      public override fun intervalUnit(): String = unwrap(this).getIntervalUnit()
    }

    public companion object {
      init {

      }

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
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DeprecateRuleProperty {
    public fun count(): Number? = unwrap(this).getCount()

    public fun interval(): Number? = unwrap(this).getInterval()

    public fun intervalUnit(): String? = unwrap(this).getIntervalUnit()

    public interface Builder {
      public fun count(count: Number) {
      }

      public fun interval(interval: Number) {
      }

      public fun intervalUnit(intervalUnit: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty.Builder =
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty.builder()

      public override fun count(count: Number) {
        cdkBuilder.count(count)
      }

      public override fun interval(interval: Number) {
        cdkBuilder.interval(interval)
      }

      public override fun intervalUnit(intervalUnit: String) {
        cdkBuilder.intervalUnit(intervalUnit)
      }

      public fun build():
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty,
    ) : DeprecateRuleProperty {
      public override fun count(): Number? = unwrap(this).getCount()

      public override fun interval(): Number? = unwrap(this).getInterval()

      public override fun intervalUnit(): String? = unwrap(this).getIntervalUnit()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeprecateRuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty):
          DeprecateRuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeprecateRuleProperty):
          software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
