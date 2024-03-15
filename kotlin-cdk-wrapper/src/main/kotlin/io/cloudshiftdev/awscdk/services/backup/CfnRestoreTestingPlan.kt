@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRestoreTestingPlan internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrRestoreTestingPlanArn(): String = unwrap(this).getAttrRestoreTestingPlanArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun recoveryPointSelection(): Any = unwrap(this).getRecoveryPointSelection()

  public open fun recoveryPointSelection(`value`: IResolvable) {
    unwrap(this).setRecoveryPointSelection(`value`.let(IResolvable::unwrap))
  }

  public open fun recoveryPointSelection(`value`: RestoreTestingRecoveryPointSelectionProperty) {
    unwrap(this).setRecoveryPointSelection(`value`.let(RestoreTestingRecoveryPointSelectionProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("54cc7c1d51762618c7a49bc3d904fc89b72191615c3cb0991540c80b9d6d579e")
  public open
      fun recoveryPointSelection(`value`: RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit):
      Unit = recoveryPointSelection(RestoreTestingRecoveryPointSelectionProperty(`value`))

  public open fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

  public open fun restoreTestingPlanName(`value`: String) {
    unwrap(this).setRestoreTestingPlanName(`value`)
  }

  public open fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

  public open fun scheduleExpression(`value`: String) {
    unwrap(this).setScheduleExpression(`value`)
  }

  public open fun scheduleExpressionTimezone(): String? =
      unwrap(this).getScheduleExpressionTimezone()

  public open fun scheduleExpressionTimezone(`value`: String) {
    unwrap(this).setScheduleExpressionTimezone(`value`)
  }

  public open fun startWindowHours(): Number? = unwrap(this).getStartWindowHours()

  public open fun startWindowHours(`value`: Number) {
    unwrap(this).setStartWindowHours(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun recoveryPointSelection(recoveryPointSelection: IResolvable)

    public
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b3a9ca86c017a53bbee13ce70f37f2e2547d5a9fb6145fbf9c282648c52d32")
    public
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit)

    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    public fun scheduleExpression(scheduleExpression: String)

    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

    public fun startWindowHours(startWindowHours: Number)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.Builder.create(scope, id)

    override fun recoveryPointSelection(recoveryPointSelection: IResolvable) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(IResolvable::unwrap))
    }

    override
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty) {
      cdkBuilder.recoveryPointSelection(recoveryPointSelection.let(RestoreTestingRecoveryPointSelectionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a3b3a9ca86c017a53bbee13ce70f37f2e2547d5a9fb6145fbf9c282648c52d32")
    override
        fun recoveryPointSelection(recoveryPointSelection: RestoreTestingRecoveryPointSelectionProperty.Builder.() -> Unit):
        Unit =
        recoveryPointSelection(RestoreTestingRecoveryPointSelectionProperty(recoveryPointSelection))

    override fun restoreTestingPlanName(restoreTestingPlanName: String) {
      cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    override fun startWindowHours(startWindowHours: Number) {
      cdkBuilder.startWindowHours(startWindowHours)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingPlan =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRestoreTestingPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRestoreTestingPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan):
        CfnRestoreTestingPlan = CfnRestoreTestingPlan(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingPlan):
        software.amazon.awscdk.services.backup.CfnRestoreTestingPlan = wrapped.cdkObject
  }

  public interface RestoreTestingRecoveryPointSelectionProperty {
    public fun algorithm(): String

    public fun excludeVaults(): List<String> = unwrap(this).getExcludeVaults() ?: emptyList()

    public fun includeVaults(): List<String>

    public fun recoveryPointTypes(): List<String>

    public fun selectionWindowDays(): Number? = unwrap(this).getSelectionWindowDays()

    @CdkDslMarker
    public interface Builder {
      public fun algorithm(algorithm: String)

      public fun excludeVaults(excludeVaults: List<String>)

      public fun excludeVaults(vararg excludeVaults: String)

      public fun includeVaults(includeVaults: List<String>)

      public fun includeVaults(vararg includeVaults: String)

      public fun recoveryPointTypes(recoveryPointTypes: List<String>)

      public fun recoveryPointTypes(vararg recoveryPointTypes: String)

      public fun selectionWindowDays(selectionWindowDays: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty.builder()

      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      override fun excludeVaults(excludeVaults: List<String>) {
        cdkBuilder.excludeVaults(excludeVaults)
      }

      override fun excludeVaults(vararg excludeVaults: String): Unit =
          excludeVaults(excludeVaults.toList())

      override fun includeVaults(includeVaults: List<String>) {
        cdkBuilder.includeVaults(includeVaults)
      }

      override fun includeVaults(vararg includeVaults: String): Unit =
          includeVaults(includeVaults.toList())

      override fun recoveryPointTypes(recoveryPointTypes: List<String>) {
        cdkBuilder.recoveryPointTypes(recoveryPointTypes)
      }

      override fun recoveryPointTypes(vararg recoveryPointTypes: String): Unit =
          recoveryPointTypes(recoveryPointTypes.toList())

      override fun selectionWindowDays(selectionWindowDays: Number) {
        cdkBuilder.selectionWindowDays(selectionWindowDays)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty,
    ) : CdkObject(cdkObject), RestoreTestingRecoveryPointSelectionProperty {
      override fun algorithm(): String = unwrap(this).getAlgorithm()

      override fun excludeVaults(): List<String> = unwrap(this).getExcludeVaults() ?: emptyList()

      override fun includeVaults(): List<String> = unwrap(this).getIncludeVaults()

      override fun recoveryPointTypes(): List<String> = unwrap(this).getRecoveryPointTypes()

      override fun selectionWindowDays(): Number? = unwrap(this).getSelectionWindowDays()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RestoreTestingRecoveryPointSelectionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty):
          RestoreTestingRecoveryPointSelectionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RestoreTestingRecoveryPointSelectionProperty):
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnRestoreTestingPlan.RestoreTestingRecoveryPointSelectionProperty
    }
  }
}
