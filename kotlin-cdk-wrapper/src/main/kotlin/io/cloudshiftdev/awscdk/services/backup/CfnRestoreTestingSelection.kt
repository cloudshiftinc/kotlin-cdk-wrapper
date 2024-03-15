@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnRestoreTestingSelection internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.backup.CfnRestoreTestingSelection,
) : CfnResource(cdkObject), IInspectable {
  public open fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun protectedResourceArns(): List<String> = unwrap(this).getProtectedResourceArns() ?:
      emptyList()

  public open fun protectedResourceArns(`value`: List<String>) {
    unwrap(this).setProtectedResourceArns(`value`)
  }

  public open fun protectedResourceArns(vararg `value`: String): Unit =
      protectedResourceArns(`value`.toList())

  public open fun protectedResourceConditions(): Any? =
      unwrap(this).getProtectedResourceConditions()

  public open fun protectedResourceConditions(`value`: IResolvable) {
    unwrap(this).setProtectedResourceConditions(`value`.let(IResolvable::unwrap))
  }

  public open fun protectedResourceConditions(`value`: ProtectedResourceConditionsProperty) {
    unwrap(this).setProtectedResourceConditions(`value`.let(ProtectedResourceConditionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7f48a98c95edfb520ba1fa79815921a76584b3a5922039646d957b98efa6b9dc")
  public open
      fun protectedResourceConditions(`value`: ProtectedResourceConditionsProperty.Builder.() -> Unit):
      Unit = protectedResourceConditions(ProtectedResourceConditionsProperty(`value`))

  public open fun protectedResourceType(): String = unwrap(this).getProtectedResourceType()

  public open fun protectedResourceType(`value`: String) {
    unwrap(this).setProtectedResourceType(`value`)
  }

  public open fun restoreMetadataOverrides(): Any? = unwrap(this).getRestoreMetadataOverrides()

  public open fun restoreMetadataOverrides(`value`: IResolvable) {
    unwrap(this).setRestoreMetadataOverrides(`value`.let(IResolvable::unwrap))
  }

  public open fun restoreMetadataOverrides(`value`: Map<String, String>) {
    unwrap(this).setRestoreMetadataOverrides(`value`)
  }

  public open fun restoreTestingPlanName(): String = unwrap(this).getRestoreTestingPlanName()

  public open fun restoreTestingPlanName(`value`: String) {
    unwrap(this).setRestoreTestingPlanName(`value`)
  }

  public open fun restoreTestingSelectionName(): String =
      unwrap(this).getRestoreTestingSelectionName()

  public open fun restoreTestingSelectionName(`value`: String) {
    unwrap(this).setRestoreTestingSelectionName(`value`)
  }

  public open fun validationWindowHours(): Number? = unwrap(this).getValidationWindowHours()

  public open fun validationWindowHours(`value`: Number) {
    unwrap(this).setValidationWindowHours(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun iamRoleArn(iamRoleArn: String)

    public fun protectedResourceArns(protectedResourceArns: List<String>)

    public fun protectedResourceArns(vararg protectedResourceArns: String)

    public fun protectedResourceConditions(protectedResourceConditions: IResolvable)

    public
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6c9d9462c60730707d90823a6dea40bd58f689723ba4ec35c88dca6a2ad2fb")
    public
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty.Builder.() -> Unit)

    public fun protectedResourceType(protectedResourceType: String)

    public fun restoreMetadataOverrides(restoreMetadataOverrides: IResolvable)

    public fun restoreMetadataOverrides(restoreMetadataOverrides: Map<String, String>)

    public fun restoreTestingPlanName(restoreTestingPlanName: String)

    public fun restoreTestingSelectionName(restoreTestingSelectionName: String)

    public fun validationWindowHours(validationWindowHours: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.Builder =
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.Builder.create(scope, id)

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
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty) {
      cdkBuilder.protectedResourceConditions(protectedResourceConditions.let(ProtectedResourceConditionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bc6c9d9462c60730707d90823a6dea40bd58f689723ba4ec35c88dca6a2ad2fb")
    override
        fun protectedResourceConditions(protectedResourceConditions: ProtectedResourceConditionsProperty.Builder.() -> Unit):
        Unit =
        protectedResourceConditions(ProtectedResourceConditionsProperty(protectedResourceConditions))

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

    public fun build(): software.amazon.awscdk.services.backup.CfnRestoreTestingSelection =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRestoreTestingSelection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRestoreTestingSelection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection):
        CfnRestoreTestingSelection = CfnRestoreTestingSelection(cdkObject)

    internal fun unwrap(wrapped: CfnRestoreTestingSelection):
        software.amazon.awscdk.services.backup.CfnRestoreTestingSelection = wrapped.cdkObject
  }

  public interface ProtectedResourceConditionsProperty {
    public fun stringEquals(): Any? = unwrap(this).getStringEquals()

    public fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()

    @CdkDslMarker
    public interface Builder {
      public fun stringEquals(stringEquals: IResolvable)

      public fun stringEquals(stringEquals: List<Any>)

      public fun stringEquals(vararg stringEquals: Any)

      public fun stringNotEquals(stringNotEquals: IResolvable)

      public fun stringNotEquals(stringNotEquals: List<Any>)

      public fun stringNotEquals(vararg stringNotEquals: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty.builder()

      override fun stringEquals(stringEquals: IResolvable) {
        cdkBuilder.stringEquals(stringEquals.let(IResolvable::unwrap))
      }

      override fun stringEquals(stringEquals: List<Any>) {
        cdkBuilder.stringEquals(stringEquals)
      }

      override fun stringEquals(vararg stringEquals: Any): Unit =
          stringEquals(stringEquals.toList())

      override fun stringNotEquals(stringNotEquals: IResolvable) {
        cdkBuilder.stringNotEquals(stringNotEquals.let(IResolvable::unwrap))
      }

      override fun stringNotEquals(stringNotEquals: List<Any>) {
        cdkBuilder.stringNotEquals(stringNotEquals)
      }

      override fun stringNotEquals(vararg stringNotEquals: Any): Unit =
          stringNotEquals(stringNotEquals.toList())

      public fun build():
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty,
    ) : CdkObject(cdkObject), ProtectedResourceConditionsProperty {
      override fun stringEquals(): Any? = unwrap(this).getStringEquals()

      override fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ProtectedResourceConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty):
          ProtectedResourceConditionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtectedResourceConditionsProperty):
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.ProtectedResourceConditionsProperty
    }
  }

  public interface KeyValueProperty {
    public fun key(): String

    public fun `value`(): String

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty,
    ) : CdkObject(cdkObject), KeyValueProperty {
      override fun key(): String = unwrap(this).getKey()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KeyValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty):
          KeyValueProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: KeyValueProperty):
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.backup.CfnRestoreTestingSelection.KeyValueProperty
    }
  }
}
