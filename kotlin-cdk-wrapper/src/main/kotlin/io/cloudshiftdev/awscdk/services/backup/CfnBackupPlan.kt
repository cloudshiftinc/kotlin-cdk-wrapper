@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBackupPlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrBackupPlanArn(): String = unwrap(this).getAttrBackupPlanArn()

  public open fun attrBackupPlanId(): String = unwrap(this).getAttrBackupPlanId()

  public open fun attrVersionId(): String = unwrap(this).getAttrVersionId()

  public open fun backupPlan(): Any = unwrap(this).getBackupPlan()

  public open fun backupPlan(`value`: IResolvable) {
    unwrap(this).setBackupPlan(`value`.let(IResolvable::unwrap))
  }

  public open fun backupPlan(`value`: BackupPlanResourceTypeProperty) {
    unwrap(this).setBackupPlan(`value`.let(BackupPlanResourceTypeProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("522556c9091b796c41792f90736082229ff0533d6bd39915807003fd7833af28")
  public open fun backupPlan(`value`: BackupPlanResourceTypeProperty.Builder.() -> Unit): Unit =
      backupPlan(BackupPlanResourceTypeProperty(`value`))

  public open fun backupPlanTags(): Map<String, String> = unwrap(this).getBackupPlanTags() ?:
      emptyMap()

  public open fun backupPlanTags(`value`: Map<String, String>) {
    unwrap(this).setBackupPlanTags(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun backupPlan(backupPlan: IResolvable)

    public fun backupPlan(backupPlan: BackupPlanResourceTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d790c488ea554c98218cf0812f40687ff90d3707d2cee1dff1218fa54bdd5c5")
    public fun backupPlan(backupPlan: BackupPlanResourceTypeProperty.Builder.() -> Unit)

    public fun backupPlanTags(backupPlanTags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupPlan.Builder =
        software.amazon.awscdk.services.backup.CfnBackupPlan.Builder.create(scope, id)

    override fun backupPlan(backupPlan: IResolvable) {
      cdkBuilder.backupPlan(backupPlan.let(IResolvable::unwrap))
    }

    override fun backupPlan(backupPlan: BackupPlanResourceTypeProperty) {
      cdkBuilder.backupPlan(backupPlan.let(BackupPlanResourceTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d790c488ea554c98218cf0812f40687ff90d3707d2cee1dff1218fa54bdd5c5")
    override fun backupPlan(backupPlan: BackupPlanResourceTypeProperty.Builder.() -> Unit): Unit =
        backupPlan(BackupPlanResourceTypeProperty(backupPlan))

    override fun backupPlanTags(backupPlanTags: Map<String, String>) {
      cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupPlan = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnBackupPlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBackupPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBackupPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan):
        CfnBackupPlan = CfnBackupPlan(cdkObject)

    internal fun unwrap(wrapped: CfnBackupPlan):
        software.amazon.awscdk.services.backup.CfnBackupPlan = wrapped.cdkObject
  }

  public interface CopyActionResourceTypeProperty {
    public fun destinationBackupVaultArn(): String

    public fun lifecycle(): Any? = unwrap(this).getLifecycle()

    @CdkDslMarker
    public interface Builder {
      public fun destinationBackupVaultArn(destinationBackupVaultArn: String)

      public fun lifecycle(lifecycle: IResolvable)

      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbbe619efbd94ebbcffe3e2d61e20f2d1c9393f514d35642d54e265d1434d19")
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.builder()

      override fun destinationBackupVaultArn(destinationBackupVaultArn: String) {
        cdkBuilder.destinationBackupVaultArn(destinationBackupVaultArn)
      }

      override fun lifecycle(lifecycle: IResolvable) {
        cdkBuilder.lifecycle(lifecycle.let(IResolvable::unwrap))
      }

      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
        cdkBuilder.lifecycle(lifecycle.let(LifecycleResourceTypeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbbe619efbd94ebbcffe3e2d61e20f2d1c9393f514d35642d54e265d1434d19")
      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit): Unit =
          lifecycle(LifecycleResourceTypeProperty(lifecycle))

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty,
    ) : CdkObject(cdkObject), CopyActionResourceTypeProperty {
      override fun destinationBackupVaultArn(): String = unwrap(this).getDestinationBackupVaultArn()

      override fun lifecycle(): Any? = unwrap(this).getLifecycle()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CopyActionResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty):
          CopyActionResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyActionResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty
    }
  }

  public interface AdvancedBackupSettingResourceTypeProperty {
    public fun backupOptions(): Any

    public fun resourceType(): String

    @CdkDslMarker
    public interface Builder {
      public fun backupOptions(backupOptions: Any)

      public fun resourceType(resourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.builder()

      override fun backupOptions(backupOptions: Any) {
        cdkBuilder.backupOptions(backupOptions)
      }

      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty,
    ) : CdkObject(cdkObject), AdvancedBackupSettingResourceTypeProperty {
      override fun backupOptions(): Any = unwrap(this).getBackupOptions()

      override fun resourceType(): String = unwrap(this).getResourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AdvancedBackupSettingResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty):
          AdvancedBackupSettingResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AdvancedBackupSettingResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty
    }
  }

  public interface BackupPlanResourceTypeProperty {
    public fun advancedBackupSettings(): Any? = unwrap(this).getAdvancedBackupSettings()

    public fun backupPlanName(): String

    public fun backupPlanRule(): Any

    @CdkDslMarker
    public interface Builder {
      public fun advancedBackupSettings(advancedBackupSettings: IResolvable)

      public fun advancedBackupSettings(advancedBackupSettings: List<Any>)

      public fun advancedBackupSettings(vararg advancedBackupSettings: Any)

      public fun backupPlanName(backupPlanName: String)

      public fun backupPlanRule(backupPlanRule: IResolvable)

      public fun backupPlanRule(backupPlanRule: List<Any>)

      public fun backupPlanRule(vararg backupPlanRule: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.builder()

      override fun advancedBackupSettings(advancedBackupSettings: IResolvable) {
        cdkBuilder.advancedBackupSettings(advancedBackupSettings.let(IResolvable::unwrap))
      }

      override fun advancedBackupSettings(advancedBackupSettings: List<Any>) {
        cdkBuilder.advancedBackupSettings(advancedBackupSettings)
      }

      override fun advancedBackupSettings(vararg advancedBackupSettings: Any): Unit =
          advancedBackupSettings(advancedBackupSettings.toList())

      override fun backupPlanName(backupPlanName: String) {
        cdkBuilder.backupPlanName(backupPlanName)
      }

      override fun backupPlanRule(backupPlanRule: IResolvable) {
        cdkBuilder.backupPlanRule(backupPlanRule.let(IResolvable::unwrap))
      }

      override fun backupPlanRule(backupPlanRule: List<Any>) {
        cdkBuilder.backupPlanRule(backupPlanRule)
      }

      override fun backupPlanRule(vararg backupPlanRule: Any): Unit =
          backupPlanRule(backupPlanRule.toList())

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty,
    ) : CdkObject(cdkObject), BackupPlanResourceTypeProperty {
      override fun advancedBackupSettings(): Any? = unwrap(this).getAdvancedBackupSettings()

      override fun backupPlanName(): String = unwrap(this).getBackupPlanName()

      override fun backupPlanRule(): Any = unwrap(this).getBackupPlanRule()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty):
          BackupPlanResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupPlanResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty
    }
  }

  public interface BackupRuleResourceTypeProperty {
    public fun completionWindowMinutes(): Number? = unwrap(this).getCompletionWindowMinutes()

    public fun copyActions(): Any? = unwrap(this).getCopyActions()

    public fun enableContinuousBackup(): Any? = unwrap(this).getEnableContinuousBackup()

    public fun lifecycle(): Any? = unwrap(this).getLifecycle()

    public fun recoveryPointTags(): Any? = unwrap(this).getRecoveryPointTags()

    public fun ruleName(): String

    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    public fun scheduleExpressionTimezone(): String? = unwrap(this).getScheduleExpressionTimezone()

    public fun startWindowMinutes(): Number? = unwrap(this).getStartWindowMinutes()

    public fun targetBackupVault(): String

    @CdkDslMarker
    public interface Builder {
      public fun completionWindowMinutes(completionWindowMinutes: Number)

      public fun copyActions(copyActions: IResolvable)

      public fun copyActions(copyActions: List<Any>)

      public fun copyActions(vararg copyActions: Any)

      public fun enableContinuousBackup(enableContinuousBackup: Boolean)

      public fun enableContinuousBackup(enableContinuousBackup: IResolvable)

      public fun lifecycle(lifecycle: IResolvable)

      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b61328720a5c3d3b5a4be3c0e7a8de70f9f408a46a9880c179b25fb88b891133")
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit)

      public fun recoveryPointTags(recoveryPointTags: IResolvable)

      public fun recoveryPointTags(recoveryPointTags: Map<String, String>)

      public fun ruleName(ruleName: String)

      public fun scheduleExpression(scheduleExpression: String)

      public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

      public fun startWindowMinutes(startWindowMinutes: Number)

      public fun targetBackupVault(targetBackupVault: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.builder()

      override fun completionWindowMinutes(completionWindowMinutes: Number) {
        cdkBuilder.completionWindowMinutes(completionWindowMinutes)
      }

      override fun copyActions(copyActions: IResolvable) {
        cdkBuilder.copyActions(copyActions.let(IResolvable::unwrap))
      }

      override fun copyActions(copyActions: List<Any>) {
        cdkBuilder.copyActions(copyActions)
      }

      override fun copyActions(vararg copyActions: Any): Unit = copyActions(copyActions.toList())

      override fun enableContinuousBackup(enableContinuousBackup: Boolean) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup)
      }

      override fun enableContinuousBackup(enableContinuousBackup: IResolvable) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup.let(IResolvable::unwrap))
      }

      override fun lifecycle(lifecycle: IResolvable) {
        cdkBuilder.lifecycle(lifecycle.let(IResolvable::unwrap))
      }

      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
        cdkBuilder.lifecycle(lifecycle.let(LifecycleResourceTypeProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b61328720a5c3d3b5a4be3c0e7a8de70f9f408a46a9880c179b25fb88b891133")
      override fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit): Unit =
          lifecycle(LifecycleResourceTypeProperty(lifecycle))

      override fun recoveryPointTags(recoveryPointTags: IResolvable) {
        cdkBuilder.recoveryPointTags(recoveryPointTags.let(IResolvable::unwrap))
      }

      override fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
        cdkBuilder.recoveryPointTags(recoveryPointTags)
      }

      override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
        cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
      }

      override fun startWindowMinutes(startWindowMinutes: Number) {
        cdkBuilder.startWindowMinutes(startWindowMinutes)
      }

      override fun targetBackupVault(targetBackupVault: String) {
        cdkBuilder.targetBackupVault(targetBackupVault)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty,
    ) : CdkObject(cdkObject), BackupRuleResourceTypeProperty {
      override fun completionWindowMinutes(): Number? = unwrap(this).getCompletionWindowMinutes()

      override fun copyActions(): Any? = unwrap(this).getCopyActions()

      override fun enableContinuousBackup(): Any? = unwrap(this).getEnableContinuousBackup()

      override fun lifecycle(): Any? = unwrap(this).getLifecycle()

      override fun recoveryPointTags(): Any? = unwrap(this).getRecoveryPointTags()

      override fun ruleName(): String = unwrap(this).getRuleName()

      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

      override fun scheduleExpressionTimezone(): String? =
          unwrap(this).getScheduleExpressionTimezone()

      override fun startWindowMinutes(): Number? = unwrap(this).getStartWindowMinutes()

      override fun targetBackupVault(): String = unwrap(this).getTargetBackupVault()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): BackupRuleResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty):
          BackupRuleResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupRuleResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty
    }
  }

  public interface LifecycleResourceTypeProperty {
    public fun deleteAfterDays(): Number? = unwrap(this).getDeleteAfterDays()

    public fun moveToColdStorageAfterDays(): Number? = unwrap(this).getMoveToColdStorageAfterDays()

    public fun optInToArchiveForSupportedResources(): Any? =
        unwrap(this).getOptInToArchiveForSupportedResources()

    @CdkDslMarker
    public interface Builder {
      public fun deleteAfterDays(deleteAfterDays: Number)

      public fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number)

      public fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: Boolean)

      public
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty.builder()

      override fun deleteAfterDays(deleteAfterDays: Number) {
        cdkBuilder.deleteAfterDays(deleteAfterDays)
      }

      override fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number) {
        cdkBuilder.moveToColdStorageAfterDays(moveToColdStorageAfterDays)
      }

      override
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: Boolean) {
        cdkBuilder.optInToArchiveForSupportedResources(optInToArchiveForSupportedResources)
      }

      override
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: IResolvable) {
        cdkBuilder.optInToArchiveForSupportedResources(optInToArchiveForSupportedResources.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty,
    ) : CdkObject(cdkObject), LifecycleResourceTypeProperty {
      override fun deleteAfterDays(): Number? = unwrap(this).getDeleteAfterDays()

      override fun moveToColdStorageAfterDays(): Number? =
          unwrap(this).getMoveToColdStorageAfterDays()

      override fun optInToArchiveForSupportedResources(): Any? =
          unwrap(this).getOptInToArchiveForSupportedResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty):
          LifecycleResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty
    }
  }
}
