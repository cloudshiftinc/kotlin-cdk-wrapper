@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

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

public open class CfnPatchBaseline internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun approvalRules(): Any? = unwrap(this).getApprovalRules()

  public open fun approvalRules(`value`: IResolvable) {
    unwrap(this).setApprovalRules(`value`.let(IResolvable::unwrap))
  }

  public open fun approvalRules(`value`: RuleGroupProperty) {
    unwrap(this).setApprovalRules(`value`.let(RuleGroupProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("faa23ebab1b153bca4872d0f98570972a16111705446b96cb909d9c1a755dc14")
  public open fun approvalRules(`value`: RuleGroupProperty.Builder.() -> Unit): Unit =
      approvalRules(RuleGroupProperty(`value`))

  public open fun approvedPatches(): List<String> = unwrap(this).getApprovedPatches() ?: emptyList()

  public open fun approvedPatches(`value`: List<String>) {
    unwrap(this).setApprovedPatches(`value`)
  }

  public open fun approvedPatches(vararg `value`: String): Unit = approvedPatches(`value`.toList())

  public open fun approvedPatchesComplianceLevel(): String? =
      unwrap(this).getApprovedPatchesComplianceLevel()

  public open fun approvedPatchesComplianceLevel(`value`: String) {
    unwrap(this).setApprovedPatchesComplianceLevel(`value`)
  }

  public open fun approvedPatchesEnableNonSecurity(): Any? =
      unwrap(this).getApprovedPatchesEnableNonSecurity()

  public open fun approvedPatchesEnableNonSecurity(`value`: Boolean) {
    unwrap(this).setApprovedPatchesEnableNonSecurity(`value`)
  }

  public open fun approvedPatchesEnableNonSecurity(`value`: IResolvable) {
    unwrap(this).setApprovedPatchesEnableNonSecurity(`value`.let(IResolvable::unwrap))
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun defaultBaseline(): Any? = unwrap(this).getDefaultBaseline()

  public open fun defaultBaseline(`value`: Boolean) {
    unwrap(this).setDefaultBaseline(`value`)
  }

  public open fun defaultBaseline(`value`: IResolvable) {
    unwrap(this).setDefaultBaseline(`value`.let(IResolvable::unwrap))
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun globalFilters(): Any? = unwrap(this).getGlobalFilters()

  public open fun globalFilters(`value`: IResolvable) {
    unwrap(this).setGlobalFilters(`value`.let(IResolvable::unwrap))
  }

  public open fun globalFilters(`value`: PatchFilterGroupProperty) {
    unwrap(this).setGlobalFilters(`value`.let(PatchFilterGroupProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4d919fd4a63a1e2cfc4d0a586490a118c08470c5858ea695b0bebbade9541872")
  public open fun globalFilters(`value`: PatchFilterGroupProperty.Builder.() -> Unit): Unit =
      globalFilters(PatchFilterGroupProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  public open fun operatingSystem(`value`: String) {
    unwrap(this).setOperatingSystem(`value`)
  }

  public open fun patchGroups(): List<String> = unwrap(this).getPatchGroups() ?: emptyList()

  public open fun patchGroups(`value`: List<String>) {
    unwrap(this).setPatchGroups(`value`)
  }

  public open fun patchGroups(vararg `value`: String): Unit = patchGroups(`value`.toList())

  public open fun rejectedPatches(): List<String> = unwrap(this).getRejectedPatches() ?: emptyList()

  public open fun rejectedPatches(`value`: List<String>) {
    unwrap(this).setRejectedPatches(`value`)
  }

  public open fun rejectedPatches(vararg `value`: String): Unit = rejectedPatches(`value`.toList())

  public open fun rejectedPatchesAction(): String? = unwrap(this).getRejectedPatchesAction()

  public open fun rejectedPatchesAction(`value`: String) {
    unwrap(this).setRejectedPatchesAction(`value`)
  }

  public open fun sources(): Any? = unwrap(this).getSources()

  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  public open fun sources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSources(__idx_ac66f0)
  }

  public open fun sources(vararg __idx_ac66f0: Any): Unit = sources(__idx_ac66f0.toList())

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun approvalRules(approvalRules: IResolvable)

    public fun approvalRules(approvalRules: RuleGroupProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d415bca7b2dc9279fc09df5ef34a8a536b7eaa5785903c7480e88fc90a2b3b")
    public fun approvalRules(approvalRules: RuleGroupProperty.Builder.() -> Unit)

    public fun approvedPatches(approvedPatches: List<String>)

    public fun approvedPatches(vararg approvedPatches: String)

    public fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String)

    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean)

    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable)

    public fun defaultBaseline(defaultBaseline: Boolean)

    public fun defaultBaseline(defaultBaseline: IResolvable)

    public fun description(description: String)

    public fun globalFilters(globalFilters: IResolvable)

    public fun globalFilters(globalFilters: PatchFilterGroupProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51b3a6dc20ee5e4012e3f5957be3a49d8591696eb8a2e2f57c566319b32bea10")
    public fun globalFilters(globalFilters: PatchFilterGroupProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun operatingSystem(operatingSystem: String)

    public fun patchGroups(patchGroups: List<String>)

    public fun patchGroups(vararg patchGroups: String)

    public fun rejectedPatches(rejectedPatches: List<String>)

    public fun rejectedPatches(vararg rejectedPatches: String)

    public fun rejectedPatchesAction(rejectedPatchesAction: String)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun sources(vararg sources: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnPatchBaseline.Builder =
        software.amazon.awscdk.services.ssm.CfnPatchBaseline.Builder.create(scope, id)

    override fun approvalRules(approvalRules: IResolvable) {
      cdkBuilder.approvalRules(approvalRules.let(IResolvable::unwrap))
    }

    override fun approvalRules(approvalRules: RuleGroupProperty) {
      cdkBuilder.approvalRules(approvalRules.let(RuleGroupProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("46d415bca7b2dc9279fc09df5ef34a8a536b7eaa5785903c7480e88fc90a2b3b")
    override fun approvalRules(approvalRules: RuleGroupProperty.Builder.() -> Unit): Unit =
        approvalRules(RuleGroupProperty(approvalRules))

    override fun approvedPatches(approvedPatches: List<String>) {
      cdkBuilder.approvedPatches(approvedPatches)
    }

    override fun approvedPatches(vararg approvedPatches: String): Unit =
        approvedPatches(approvedPatches.toList())

    override fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String) {
      cdkBuilder.approvedPatchesComplianceLevel(approvedPatchesComplianceLevel)
    }

    override fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean) {
      cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity)
    }

    override fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable) {
      cdkBuilder.approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity.let(IResolvable::unwrap))
    }

    override fun defaultBaseline(defaultBaseline: Boolean) {
      cdkBuilder.defaultBaseline(defaultBaseline)
    }

    override fun defaultBaseline(defaultBaseline: IResolvable) {
      cdkBuilder.defaultBaseline(defaultBaseline.let(IResolvable::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun globalFilters(globalFilters: IResolvable) {
      cdkBuilder.globalFilters(globalFilters.let(IResolvable::unwrap))
    }

    override fun globalFilters(globalFilters: PatchFilterGroupProperty) {
      cdkBuilder.globalFilters(globalFilters.let(PatchFilterGroupProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("51b3a6dc20ee5e4012e3f5957be3a49d8591696eb8a2e2f57c566319b32bea10")
    override fun globalFilters(globalFilters: PatchFilterGroupProperty.Builder.() -> Unit): Unit =
        globalFilters(PatchFilterGroupProperty(globalFilters))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    override fun patchGroups(patchGroups: List<String>) {
      cdkBuilder.patchGroups(patchGroups)
    }

    override fun patchGroups(vararg patchGroups: String): Unit = patchGroups(patchGroups.toList())

    override fun rejectedPatches(rejectedPatches: List<String>) {
      cdkBuilder.rejectedPatches(rejectedPatches)
    }

    override fun rejectedPatches(vararg rejectedPatches: String): Unit =
        rejectedPatches(rejectedPatches.toList())

    override fun rejectedPatchesAction(rejectedPatchesAction: String) {
      cdkBuilder.rejectedPatchesAction(rejectedPatchesAction)
    }

    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssm.CfnPatchBaseline.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPatchBaseline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPatchBaseline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline):
        CfnPatchBaseline = CfnPatchBaseline(cdkObject)

    internal fun unwrap(wrapped: CfnPatchBaseline):
        software.amazon.awscdk.services.ssm.CfnPatchBaseline = wrapped.cdkObject
  }

  public interface PatchFilterProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun values(): List<String> = unwrap(this).getValues() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun values(values: List<String>)

      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty,
    ) : CdkObject(cdkObject), PatchFilterProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun values(): List<String> = unwrap(this).getValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PatchFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty):
          PatchFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatchFilterProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterProperty
    }
  }

  public interface PatchFilterGroupProperty {
    public fun patchFilters(): Any? = unwrap(this).getPatchFilters()

    @CdkDslMarker
    public interface Builder {
      public fun patchFilters(patchFilters: IResolvable)

      public fun patchFilters(patchFilters: List<Any>)

      public fun patchFilters(vararg patchFilters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty.builder()

      override fun patchFilters(patchFilters: IResolvable) {
        cdkBuilder.patchFilters(patchFilters.let(IResolvable::unwrap))
      }

      override fun patchFilters(patchFilters: List<Any>) {
        cdkBuilder.patchFilters(patchFilters)
      }

      override fun patchFilters(vararg patchFilters: Any): Unit =
          patchFilters(patchFilters.toList())

      public fun build():
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty,
    ) : CdkObject(cdkObject), PatchFilterGroupProperty {
      override fun patchFilters(): Any? = unwrap(this).getPatchFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PatchFilterGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty):
          PatchFilterGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatchFilterGroupProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchFilterGroupProperty
    }
  }

  public interface PatchSourceProperty {
    public fun configuration(): String? = unwrap(this).getConfiguration()

    public fun name(): String? = unwrap(this).getName()

    public fun products(): List<String> = unwrap(this).getProducts() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun configuration(configuration: String)

      public fun name(name: String)

      public fun products(products: List<String>)

      public fun products(vararg products: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty.builder()

      override fun configuration(configuration: String) {
        cdkBuilder.configuration(configuration)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun products(products: List<String>) {
        cdkBuilder.products(products)
      }

      override fun products(vararg products: String): Unit = products(products.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty,
    ) : CdkObject(cdkObject), PatchSourceProperty {
      override fun configuration(): String? = unwrap(this).getConfiguration()

      override fun name(): String? = unwrap(this).getName()

      override fun products(): List<String> = unwrap(this).getProducts() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PatchSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty):
          PatchSourceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PatchSourceProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.PatchSourceProperty
    }
  }

  public interface RuleProperty {
    public fun approveAfterDays(): Number? = unwrap(this).getApproveAfterDays()

    public fun approveUntilDate(): String? = unwrap(this).getApproveUntilDate()

    public fun complianceLevel(): String? = unwrap(this).getComplianceLevel()

    public fun enableNonSecurity(): Any? = unwrap(this).getEnableNonSecurity()

    public fun patchFilterGroup(): Any? = unwrap(this).getPatchFilterGroup()

    @CdkDslMarker
    public interface Builder {
      public fun approveAfterDays(approveAfterDays: Number)

      public fun approveUntilDate(approveUntilDate: String)

      public fun complianceLevel(complianceLevel: String)

      public fun enableNonSecurity(enableNonSecurity: Boolean)

      public fun enableNonSecurity(enableNonSecurity: IResolvable)

      public fun patchFilterGroup(patchFilterGroup: IResolvable)

      public fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("188a3d6eaef2727403d5cd8b35fdb8fc1f8b3f82392cf3919cbf36289fa431d8")
      public fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty.builder()

      override fun approveAfterDays(approveAfterDays: Number) {
        cdkBuilder.approveAfterDays(approveAfterDays)
      }

      override fun approveUntilDate(approveUntilDate: String) {
        cdkBuilder.approveUntilDate(approveUntilDate)
      }

      override fun complianceLevel(complianceLevel: String) {
        cdkBuilder.complianceLevel(complianceLevel)
      }

      override fun enableNonSecurity(enableNonSecurity: Boolean) {
        cdkBuilder.enableNonSecurity(enableNonSecurity)
      }

      override fun enableNonSecurity(enableNonSecurity: IResolvable) {
        cdkBuilder.enableNonSecurity(enableNonSecurity.let(IResolvable::unwrap))
      }

      override fun patchFilterGroup(patchFilterGroup: IResolvable) {
        cdkBuilder.patchFilterGroup(patchFilterGroup.let(IResolvable::unwrap))
      }

      override fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty) {
        cdkBuilder.patchFilterGroup(patchFilterGroup.let(PatchFilterGroupProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("188a3d6eaef2727403d5cd8b35fdb8fc1f8b3f82392cf3919cbf36289fa431d8")
      override fun patchFilterGroup(patchFilterGroup: PatchFilterGroupProperty.Builder.() -> Unit):
          Unit = patchFilterGroup(PatchFilterGroupProperty(patchFilterGroup))

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty,
    ) : CdkObject(cdkObject), RuleProperty {
      override fun approveAfterDays(): Number? = unwrap(this).getApproveAfterDays()

      override fun approveUntilDate(): String? = unwrap(this).getApproveUntilDate()

      override fun complianceLevel(): String? = unwrap(this).getComplianceLevel()

      override fun enableNonSecurity(): Any? = unwrap(this).getEnableNonSecurity()

      override fun patchFilterGroup(): Any? = unwrap(this).getPatchFilterGroup()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty):
          RuleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleProperty
    }
  }

  public interface RuleGroupProperty {
    public fun patchRules(): Any? = unwrap(this).getPatchRules()

    @CdkDslMarker
    public interface Builder {
      public fun patchRules(patchRules: IResolvable)

      public fun patchRules(patchRules: List<Any>)

      public fun patchRules(vararg patchRules: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty.Builder =
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty.builder()

      override fun patchRules(patchRules: IResolvable) {
        cdkBuilder.patchRules(patchRules.let(IResolvable::unwrap))
      }

      override fun patchRules(patchRules: List<Any>) {
        cdkBuilder.patchRules(patchRules)
      }

      override fun patchRules(vararg patchRules: Any): Unit = patchRules(patchRules.toList())

      public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty,
    ) : CdkObject(cdkObject), RuleGroupProperty {
      override fun patchRules(): Any? = unwrap(this).getPatchRules()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RuleGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty):
          RuleGroupProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RuleGroupProperty):
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.ssm.CfnPatchBaseline.RuleGroupProperty
    }
  }
}
