package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBackupPlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan,
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

  @Suppress("INAPPLICABLE_JVM_NAME")
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

  public interface Builder {
    public fun backupPlan(backupPlan: IResolvable) {
    }

    public fun backupPlan(backupPlan: BackupPlanResourceTypeProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d790c488ea554c98218cf0812f40687ff90d3707d2cee1dff1218fa54bdd5c5")
    public fun backupPlan(backupPlan: BackupPlanResourceTypeProperty.Builder.() -> Unit) {
    }

    public fun backupPlanTags(backupPlanTags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupPlan.Builder =
        software.amazon.awscdk.services.backup.CfnBackupPlan.Builder.create(scope, id)

    public override fun backupPlan(backupPlan: IResolvable) {
      cdkBuilder.backupPlan(backupPlan.let(IResolvable::unwrap))
    }

    public override fun backupPlan(backupPlan: BackupPlanResourceTypeProperty) {
      cdkBuilder.backupPlan(backupPlan.let(BackupPlanResourceTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6d790c488ea554c98218cf0812f40687ff90d3707d2cee1dff1218fa54bdd5c5")
    public override fun backupPlan(backupPlan: BackupPlanResourceTypeProperty.Builder.() -> Unit):
        Unit = backupPlan(BackupPlanResourceTypeProperty(backupPlan))

    public override fun backupPlanTags(backupPlanTags: Map<String, String>) {
      cdkBuilder.backupPlanTags(backupPlanTags)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupPlan = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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

    public interface Builder {
      public fun destinationBackupVaultArn(destinationBackupVaultArn: String) {
      }

      public fun lifecycle(lifecycle: IResolvable) {
      }

      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbbe619efbd94ebbcffe3e2d61e20f2d1c9393f514d35642d54e265d1434d19")
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty.builder()

      public override fun destinationBackupVaultArn(destinationBackupVaultArn: String) {
        cdkBuilder.destinationBackupVaultArn(destinationBackupVaultArn)
      }

      public override fun lifecycle(lifecycle: IResolvable) {
        cdkBuilder.lifecycle(lifecycle.let(IResolvable::unwrap))
      }

      public override fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
        cdkBuilder.lifecycle(lifecycle.let(LifecycleResourceTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9dbbe619efbd94ebbcffe3e2d61e20f2d1c9393f514d35642d54e265d1434d19")
      public override fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit):
          Unit = lifecycle(LifecycleResourceTypeProperty(lifecycle))

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty,
    ) : CopyActionResourceTypeProperty {
      public override fun destinationBackupVaultArn(): String =
          unwrap(this).getDestinationBackupVaultArn()

      public override fun lifecycle(): Any? = unwrap(this).getLifecycle()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CopyActionResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty):
          CopyActionResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CopyActionResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.CopyActionResourceTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AdvancedBackupSettingResourceTypeProperty {
    public fun backupOptions(): Any

    public fun resourceType(): String

    public interface Builder {
      public fun backupOptions(backupOptions: Any) {
      }

      public fun resourceType(resourceType: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty.builder()

      public override fun backupOptions(backupOptions: Any) {
        cdkBuilder.backupOptions(backupOptions)
      }

      public override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.AdvancedBackupSettingResourceTypeProperty,
    ) : AdvancedBackupSettingResourceTypeProperty {
      public override fun backupOptions(): Any = unwrap(this).getBackupOptions()

      public override fun resourceType(): String = unwrap(this).getResourceType()
    }

    public companion object {
      init {

      }

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
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface BackupPlanResourceTypeProperty {
    public fun advancedBackupSettings(): Any? = unwrap(this).getAdvancedBackupSettings()

    public fun backupPlanName(): String

    public fun backupPlanRule(): Any

    public interface Builder {
      public fun advancedBackupSettings(advancedBackupSettings: IResolvable) {
      }

      public fun advancedBackupSettings(advancedBackupSettings: List<Any>) {
      }

      public fun backupPlanName(backupPlanName: String) {
      }

      public fun backupPlanRule(backupPlanRule: IResolvable) {
      }

      public fun backupPlanRule(backupPlanRule: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty.builder()

      public override fun advancedBackupSettings(advancedBackupSettings: IResolvable) {
        cdkBuilder.advancedBackupSettings(advancedBackupSettings.let(IResolvable::unwrap))
      }

      public override fun advancedBackupSettings(advancedBackupSettings: List<Any>) {
        cdkBuilder.advancedBackupSettings(advancedBackupSettings)
      }

      public override fun backupPlanName(backupPlanName: String) {
        cdkBuilder.backupPlanName(backupPlanName)
      }

      public override fun backupPlanRule(backupPlanRule: IResolvable) {
        cdkBuilder.backupPlanRule(backupPlanRule.let(IResolvable::unwrap))
      }

      public override fun backupPlanRule(backupPlanRule: List<Any>) {
        cdkBuilder.backupPlanRule(backupPlanRule)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty,
    ) : BackupPlanResourceTypeProperty {
      public override fun advancedBackupSettings(): Any? = unwrap(this).getAdvancedBackupSettings()

      public override fun backupPlanName(): String = unwrap(this).getBackupPlanName()

      public override fun backupPlanRule(): Any = unwrap(this).getBackupPlanRule()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BackupPlanResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty):
          BackupPlanResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupPlanResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupPlanResourceTypeProperty =
          (wrapped as Wrapper).cdkObject
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

    public interface Builder {
      public fun completionWindowMinutes(completionWindowMinutes: Number) {
      }

      public fun copyActions(copyActions: IResolvable) {
      }

      public fun copyActions(copyActions: List<Any>) {
      }

      public fun enableContinuousBackup(enableContinuousBackup: Boolean) {
      }

      public fun enableContinuousBackup(enableContinuousBackup: IResolvable) {
      }

      public fun lifecycle(lifecycle: IResolvable) {
      }

      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b61328720a5c3d3b5a4be3c0e7a8de70f9f408a46a9880c179b25fb88b891133")
      public fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit) {
      }

      public fun recoveryPointTags(recoveryPointTags: IResolvable) {
      }

      public fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
      }

      public fun ruleName(ruleName: String) {
      }

      public fun scheduleExpression(scheduleExpression: String) {
      }

      public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      }

      public fun startWindowMinutes(startWindowMinutes: Number) {
      }

      public fun targetBackupVault(targetBackupVault: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty.builder()

      public override fun completionWindowMinutes(completionWindowMinutes: Number) {
        cdkBuilder.completionWindowMinutes(completionWindowMinutes)
      }

      public override fun copyActions(copyActions: IResolvable) {
        cdkBuilder.copyActions(copyActions.let(IResolvable::unwrap))
      }

      public override fun copyActions(copyActions: List<Any>) {
        cdkBuilder.copyActions(copyActions)
      }

      public override fun enableContinuousBackup(enableContinuousBackup: Boolean) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup)
      }

      public override fun enableContinuousBackup(enableContinuousBackup: IResolvable) {
        cdkBuilder.enableContinuousBackup(enableContinuousBackup.let(IResolvable::unwrap))
      }

      public override fun lifecycle(lifecycle: IResolvable) {
        cdkBuilder.lifecycle(lifecycle.let(IResolvable::unwrap))
      }

      public override fun lifecycle(lifecycle: LifecycleResourceTypeProperty) {
        cdkBuilder.lifecycle(lifecycle.let(LifecycleResourceTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b61328720a5c3d3b5a4be3c0e7a8de70f9f408a46a9880c179b25fb88b891133")
      public override fun lifecycle(lifecycle: LifecycleResourceTypeProperty.Builder.() -> Unit):
          Unit = lifecycle(LifecycleResourceTypeProperty(lifecycle))

      public override fun recoveryPointTags(recoveryPointTags: IResolvable) {
        cdkBuilder.recoveryPointTags(recoveryPointTags.let(IResolvable::unwrap))
      }

      public override fun recoveryPointTags(recoveryPointTags: Map<String, String>) {
        cdkBuilder.recoveryPointTags(recoveryPointTags)
      }

      public override fun ruleName(ruleName: String) {
        cdkBuilder.ruleName(ruleName)
      }

      public override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
        cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
      }

      public override fun startWindowMinutes(startWindowMinutes: Number) {
        cdkBuilder.startWindowMinutes(startWindowMinutes)
      }

      public override fun targetBackupVault(targetBackupVault: String) {
        cdkBuilder.targetBackupVault(targetBackupVault)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty,
    ) : BackupRuleResourceTypeProperty {
      public override fun completionWindowMinutes(): Number? =
          unwrap(this).getCompletionWindowMinutes()

      public override fun copyActions(): Any? = unwrap(this).getCopyActions()

      public override fun enableContinuousBackup(): Any? = unwrap(this).getEnableContinuousBackup()

      public override fun lifecycle(): Any? = unwrap(this).getLifecycle()

      public override fun recoveryPointTags(): Any? = unwrap(this).getRecoveryPointTags()

      public override fun ruleName(): String = unwrap(this).getRuleName()

      public override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

      public override fun scheduleExpressionTimezone(): String? =
          unwrap(this).getScheduleExpressionTimezone()

      public override fun startWindowMinutes(): Number? = unwrap(this).getStartWindowMinutes()

      public override fun targetBackupVault(): String = unwrap(this).getTargetBackupVault()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BackupRuleResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty):
          BackupRuleResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupRuleResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.BackupRuleResourceTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface LifecycleResourceTypeProperty {
    public fun deleteAfterDays(): Number? = unwrap(this).getDeleteAfterDays()

    public fun moveToColdStorageAfterDays(): Number? = unwrap(this).getMoveToColdStorageAfterDays()

    public fun optInToArchiveForSupportedResources(): Any? =
        unwrap(this).getOptInToArchiveForSupportedResources()

    public interface Builder {
      public fun deleteAfterDays(deleteAfterDays: Number) {
      }

      public fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number) {
      }

      public fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: Boolean) {
      }

      public
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: IResolvable) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty.builder()

      public override fun deleteAfterDays(deleteAfterDays: Number) {
        cdkBuilder.deleteAfterDays(deleteAfterDays)
      }

      public override fun moveToColdStorageAfterDays(moveToColdStorageAfterDays: Number) {
        cdkBuilder.moveToColdStorageAfterDays(moveToColdStorageAfterDays)
      }

      public override
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: Boolean) {
        cdkBuilder.optInToArchiveForSupportedResources(optInToArchiveForSupportedResources)
      }

      public override
          fun optInToArchiveForSupportedResources(optInToArchiveForSupportedResources: IResolvable) {
        cdkBuilder.optInToArchiveForSupportedResources(optInToArchiveForSupportedResources.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty,
    ) : LifecycleResourceTypeProperty {
      public override fun deleteAfterDays(): Number? = unwrap(this).getDeleteAfterDays()

      public override fun moveToColdStorageAfterDays(): Number? =
          unwrap(this).getMoveToColdStorageAfterDays()

      public override fun optInToArchiveForSupportedResources(): Any? =
          unwrap(this).getOptInToArchiveForSupportedResources()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LifecycleResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty):
          LifecycleResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LifecycleResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupPlan.LifecycleResourceTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
