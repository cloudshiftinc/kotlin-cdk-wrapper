@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPatchBaselineProps {
  public fun approvalRules(): Any? = unwrap(this).getApprovalRules()

  public fun approvedPatches(): List<String> = unwrap(this).getApprovedPatches() ?: emptyList()

  public fun approvedPatchesComplianceLevel(): String? =
      unwrap(this).getApprovedPatchesComplianceLevel()

  public fun approvedPatchesEnableNonSecurity(): Any? =
      unwrap(this).getApprovedPatchesEnableNonSecurity()

  public fun defaultBaseline(): Any? = unwrap(this).getDefaultBaseline()

  public fun description(): String? = unwrap(this).getDescription()

  public fun globalFilters(): Any? = unwrap(this).getGlobalFilters()

  public fun name(): String

  public fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  public fun patchGroups(): List<String> = unwrap(this).getPatchGroups() ?: emptyList()

  public fun rejectedPatches(): List<String> = unwrap(this).getRejectedPatches() ?: emptyList()

  public fun rejectedPatchesAction(): String? = unwrap(this).getRejectedPatchesAction()

  public fun sources(): Any? = unwrap(this).getSources()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun approvalRules(approvalRules: IResolvable)

    public fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324ba23e826492eff004037e8b00408b74a93178e5c92fb7e27342719508ec5b")
    public fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty.Builder.() -> Unit)

    public fun approvedPatches(approvedPatches: List<String>)

    public fun approvedPatches(vararg approvedPatches: String)

    public fun approvedPatchesComplianceLevel(approvedPatchesComplianceLevel: String)

    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: Boolean)

    public fun approvedPatchesEnableNonSecurity(approvedPatchesEnableNonSecurity: IResolvable)

    public fun defaultBaseline(defaultBaseline: Boolean)

    public fun defaultBaseline(defaultBaseline: IResolvable)

    public fun description(description: String)

    public fun globalFilters(globalFilters: IResolvable)

    public fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b37d58e32cb06b692b938425f01ef08937d78805546fde156897b324eb21f50d")
    public
        fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty.Builder.() -> Unit)

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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnPatchBaselineProps.Builder =
        software.amazon.awscdk.services.ssm.CfnPatchBaselineProps.builder()

    override fun approvalRules(approvalRules: IResolvable) {
      cdkBuilder.approvalRules(approvalRules.let(IResolvable::unwrap))
    }

    override fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty) {
      cdkBuilder.approvalRules(approvalRules.let(CfnPatchBaseline.RuleGroupProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("324ba23e826492eff004037e8b00408b74a93178e5c92fb7e27342719508ec5b")
    override
        fun approvalRules(approvalRules: CfnPatchBaseline.RuleGroupProperty.Builder.() -> Unit):
        Unit = approvalRules(CfnPatchBaseline.RuleGroupProperty(approvalRules))

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

    override fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty) {
      cdkBuilder.globalFilters(globalFilters.let(CfnPatchBaseline.PatchFilterGroupProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b37d58e32cb06b692b938425f01ef08937d78805546fde156897b324eb21f50d")
    override
        fun globalFilters(globalFilters: CfnPatchBaseline.PatchFilterGroupProperty.Builder.() -> Unit):
        Unit = globalFilters(CfnPatchBaseline.PatchFilterGroupProperty(globalFilters))

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

    public fun build(): software.amazon.awscdk.services.ssm.CfnPatchBaselineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaselineProps,
  ) : CdkObject(cdkObject), CfnPatchBaselineProps {
    override fun approvalRules(): Any? = unwrap(this).getApprovalRules()

    override fun approvedPatches(): List<String> = unwrap(this).getApprovedPatches() ?: emptyList()

    override fun approvedPatchesComplianceLevel(): String? =
        unwrap(this).getApprovedPatchesComplianceLevel()

    override fun approvedPatchesEnableNonSecurity(): Any? =
        unwrap(this).getApprovedPatchesEnableNonSecurity()

    override fun defaultBaseline(): Any? = unwrap(this).getDefaultBaseline()

    override fun description(): String? = unwrap(this).getDescription()

    override fun globalFilters(): Any? = unwrap(this).getGlobalFilters()

    override fun name(): String = unwrap(this).getName()

    override fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

    override fun patchGroups(): List<String> = unwrap(this).getPatchGroups() ?: emptyList()

    override fun rejectedPatches(): List<String> = unwrap(this).getRejectedPatches() ?: emptyList()

    override fun rejectedPatchesAction(): String? = unwrap(this).getRejectedPatchesAction()

    override fun sources(): Any? = unwrap(this).getSources()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPatchBaselineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnPatchBaselineProps):
        CfnPatchBaselineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPatchBaselineProps):
        software.amazon.awscdk.services.ssm.CfnPatchBaselineProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ssm.CfnPatchBaselineProps
  }
}
