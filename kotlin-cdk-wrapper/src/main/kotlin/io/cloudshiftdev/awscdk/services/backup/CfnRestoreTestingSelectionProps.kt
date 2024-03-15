@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnRestoreTestingSelectionProps {
  public fun iamRoleArn(): String

  public fun protectedResourceArns(): List<String> = unwrap(this).getProtectedResourceArns() ?:
      emptyList()

  public fun protectedResourceConditions(): Any? = unwrap(this).getProtectedResourceConditions()

  public fun protectedResourceType(): String

  public fun restoreMetadataOverrides(): Any? = unwrap(this).getRestoreMetadataOverrides()

  public fun restoreTestingPlanName(): String

  public fun restoreTestingSelectionName(): String

  public fun validationWindowHours(): Number? = unwrap(this).getValidationWindowHours()

  @CdkDslMarker
  public interface Builder {
    public fun iamRoleArn(iamRoleArn: String)

    public fun protectedResourceArns(protectedResourceArns: List<String>)

    public fun protectedResourceArns(vararg protectedResourceArns: String)

    public fun protectedResourceConditions(protectedResourceConditions: IResolvable)

    public
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d59a266765ade5e8b02e6f4780c0f17cd749e650759532529ebc0f1bbe0dea6c")
    public
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.Builder.() -> Unit)

    public fun protectedResourceType(protectedResourceType: String)

    public fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable)

    public fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>)

    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    public fun restoreTestingSelectionName(restoreTestingSelectionName: String)

    public fun validationWindowHours(validationWindowHours: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps.builder()

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun protectedResourceArns(protectedResourceArns: List<String>) {
      cdkBuilder.protectedResourceArns(protectedResourceArns)
    }

    override fun protectedResourceArns(vararg protectedResourceArns: String): Unit =
        protectedResourceArns(protectedResourceArns.toList())

    override fun protectedResourceConditions(protectedResourceConditions: IResolvable) {
      cdkBuilder.protectedResourceConditions(protectedResourceConditions.let(IResolvable::unwrap))
    }

    override
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty) {
      cdkBuilder.protectedResourceConditions(protectedResourceConditions.let(CfnRestoreTestingSelection.ProtectedResourceConditionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d59a266765ade5e8b02e6f4780c0f17cd749e650759532529ebc0f1bbe0dea6c")
    override
        fun protectedResourceConditions(protectedResourceConditions: CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.Builder.() -> Unit):
        Unit =
        protectedResourceConditions(CfnRestoreTestingSelection.ProtectedResourceConditionsProperty(protectedResourceConditions))

    override fun protectedResourceType(protectedResourceType: String) {
      cdkBuilder.protectedResourceType(protectedResourceType)
    }

    override fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable) {
      cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides.let(IResolvable::unwrap))
    }

    override fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>) {
      cdkBuilder.restoreMetadataOverrides(restoreMetadataOverrides)
    }

    override fun restoreTestingPlanName(restoreTestingPlanName: String) {
      cdkBuilder.restoreTestingPlanName(restoreTestingPlanName)
    }

    override fun restoreTestingSelectionName(restoreTestingSelectionName: String) {
      cdkBuilder.restoreTestingSelectionName(restoreTestingSelectionName)
    }

    override fun validationWindowHours(validationWindowHours: Number) {
      cdkBuilder.validationWindowHours(validationWindowHours)
    }

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps,
  ) : CdkObject(cdkObject), CfnRestoreTestingSelectionProps {
    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    override fun protectedResourceArns(): List<String> = unwrap(this).getProtectedResourceArns() ?:
        emptyList()

    override fun protectedResourceConditions(): Any? = unwrap(this).getProtectedResourceConditions()

    override fun protectedResourceType(): String = unwrap(this).getProtectedResourceType()

    override fun restoreMetadataOverrides(): Any? = unwrap(this).getRestoreMetadataOverrides()

    override fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

    override fun restoreTestingSelectionName(): String =
        unwrap(this).getRestoreTestingSelectionName()

    override fun validationWindowHours(): Number? = unwrap(this).getValidationWindowHours()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRestoreTestingSelectionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps):
        CfnRestoreTestingSelectionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingSelectionProps):
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelectionProps
  }
}
