package io.cloudshiftdev.awscdk.services.backup

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBackupSelection internal constructor(
  private val cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrBackupPlanId(): String = unwrap(this).getAttrBackupPlanId()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrSelectionId(): String = unwrap(this).getAttrSelectionId()

  public open fun backupPlanId(): String = unwrap(this).getBackupPlanId()

  public open fun backupPlanId(`value`: String) {
    unwrap(this).setBackupPlanId(`value`)
  }

  public open fun backupSelection(): Any = unwrap(this).getBackupSelection()

  public open fun backupSelection(`value`: IResolvable) {
    unwrap(this).setBackupSelection(`value`.let(IResolvable::unwrap))
  }

  public open fun backupSelection(`value`: BackupSelectionResourceTypeProperty) {
    unwrap(this).setBackupSelection(`value`.let(BackupSelectionResourceTypeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0eba15aadf42c827b1d426dec36c8662fca75202cce8d2cb88ee45b5f4c58602")
  public open fun backupSelection(`value`: BackupSelectionResourceTypeProperty.Builder.() -> Unit):
      Unit = backupSelection(BackupSelectionResourceTypeProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public interface Builder {
    public fun backupPlanId(backupPlanId: String)

    public fun backupSelection(backupSelection: IResolvable)

    public fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f95bef2eeb59814b6a3c419d1cdcd6d56ec8116ab4586441942419bbd4e9612b")
    public
        fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.backup.CfnBackupSelection.Builder =
        software.amazon.awscdk.services.backup.CfnBackupSelection.Builder.create(scope, id)

    override fun backupPlanId(backupPlanId: String) {
      cdkBuilder.backupPlanId(backupPlanId)
    }

    override fun backupSelection(backupSelection: IResolvable) {
      cdkBuilder.backupSelection(backupSelection.let(IResolvable::unwrap))
    }

    override fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty) {
      cdkBuilder.backupSelection(backupSelection.let(BackupSelectionResourceTypeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f95bef2eeb59814b6a3c419d1cdcd6d56ec8116ab4586441942419bbd4e9612b")
    override
        fun backupSelection(backupSelection: BackupSelectionResourceTypeProperty.Builder.() -> Unit):
        Unit = backupSelection(BackupSelectionResourceTypeProperty(backupSelection))

    public fun build(): software.amazon.awscdk.services.backup.CfnBackupSelection =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBackupSelection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBackupSelection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection):
        CfnBackupSelection = CfnBackupSelection(cdkObject)

    internal fun unwrap(wrapped: CfnBackupSelection):
        software.amazon.awscdk.services.backup.CfnBackupSelection = wrapped.cdkObject
  }

  public interface ConditionParameterProperty {
    public fun conditionKey(): String? = unwrap(this).getConditionKey()

    public fun conditionValue(): String? = unwrap(this).getConditionValue()

    public interface Builder {
      public fun conditionKey(conditionKey: String)

      public fun conditionValue(conditionValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty.builder()

      override fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
      }

      override fun conditionValue(conditionValue: String) {
        cdkBuilder.conditionValue(conditionValue)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty,
    ) : ConditionParameterProperty {
      override fun conditionKey(): String? = unwrap(this).getConditionKey()

      override fun conditionValue(): String? = unwrap(this).getConditionValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty):
          ConditionParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionParameterProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionParameterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface BackupSelectionResourceTypeProperty {
    public fun conditions(): Any? = unwrap(this).getConditions()

    public fun iamRoleArn(): String

    public fun listOfTags(): Any? = unwrap(this).getListOfTags()

    public fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

    public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    public fun selectionName(): String

    public interface Builder {
      public fun conditions(conditions: Any)

      public fun iamRoleArn(iamRoleArn: String)

      public fun listOfTags(listOfTags: IResolvable)

      public fun listOfTags(listOfTags: List<Any>)

      public fun listOfTags(vararg listOfTags: Any)

      public fun notResources(notResources: List<String>)

      public fun notResources(vararg notResources: String)

      public fun resources(resources: List<String>)

      public fun resources(vararg resources: String)

      public fun selectionName(selectionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty.builder()

      override fun conditions(conditions: Any) {
        cdkBuilder.conditions(conditions)
      }

      override fun iamRoleArn(iamRoleArn: String) {
        cdkBuilder.iamRoleArn(iamRoleArn)
      }

      override fun listOfTags(listOfTags: IResolvable) {
        cdkBuilder.listOfTags(listOfTags.let(IResolvable::unwrap))
      }

      override fun listOfTags(listOfTags: List<Any>) {
        cdkBuilder.listOfTags(listOfTags)
      }

      override fun listOfTags(vararg listOfTags: Any): Unit = listOfTags(listOfTags.toList())

      override fun notResources(notResources: List<String>) {
        cdkBuilder.notResources(notResources)
      }

      override fun notResources(vararg notResources: String): Unit =
          notResources(notResources.toList())

      override fun resources(resources: List<String>) {
        cdkBuilder.resources(resources)
      }

      override fun resources(vararg resources: String): Unit = resources(resources.toList())

      override fun selectionName(selectionName: String) {
        cdkBuilder.selectionName(selectionName)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty,
    ) : BackupSelectionResourceTypeProperty {
      override fun conditions(): Any? = unwrap(this).getConditions()

      override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

      override fun listOfTags(): Any? = unwrap(this).getListOfTags()

      override fun notResources(): List<String> = unwrap(this).getNotResources() ?: emptyList()

      override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

      override fun selectionName(): String = unwrap(this).getSelectionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          BackupSelectionResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty):
          BackupSelectionResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BackupSelectionResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.BackupSelectionResourceTypeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionResourceTypeProperty {
    public fun conditionKey(): String

    public fun conditionType(): String

    public fun conditionValue(): String

    public interface Builder {
      public fun conditionKey(conditionKey: String)

      public fun conditionType(conditionType: String)

      public fun conditionValue(conditionValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty.Builder
          =
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty.builder()

      override fun conditionKey(conditionKey: String) {
        cdkBuilder.conditionKey(conditionKey)
      }

      override fun conditionType(conditionType: String) {
        cdkBuilder.conditionType(conditionType)
      }

      override fun conditionValue(conditionValue: String) {
        cdkBuilder.conditionValue(conditionValue)
      }

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty,
    ) : ConditionResourceTypeProperty {
      override fun conditionKey(): String = unwrap(this).getConditionKey()

      override fun conditionType(): String = unwrap(this).getConditionType()

      override fun conditionValue(): String = unwrap(this).getConditionValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionResourceTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty):
          ConditionResourceTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionResourceTypeProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionResourceTypeProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionsProperty {
    public fun stringEquals(): Any? = unwrap(this).getStringEquals()

    public fun stringLike(): Any? = unwrap(this).getStringLike()

    public fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()

    public fun stringNotLike(): Any? = unwrap(this).getStringNotLike()

    public interface Builder {
      public fun stringEquals(stringEquals: IResolvable)

      public fun stringEquals(stringEquals: List<Any>)

      public fun stringEquals(vararg stringEquals: Any)

      public fun stringLike(stringLike: IResolvable)

      public fun stringLike(stringLike: List<Any>)

      public fun stringLike(vararg stringLike: Any)

      public fun stringNotEquals(stringNotEquals: IResolvable)

      public fun stringNotEquals(stringNotEquals: List<Any>)

      public fun stringNotEquals(vararg stringNotEquals: Any)

      public fun stringNotLike(stringNotLike: IResolvable)

      public fun stringNotLike(stringNotLike: List<Any>)

      public fun stringNotLike(vararg stringNotLike: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty.Builder =
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty.builder()

      override fun stringEquals(stringEquals: IResolvable) {
        cdkBuilder.stringEquals(stringEquals.let(IResolvable::unwrap))
      }

      override fun stringEquals(stringEquals: List<Any>) {
        cdkBuilder.stringEquals(stringEquals)
      }

      override fun stringEquals(vararg stringEquals: Any): Unit =
          stringEquals(stringEquals.toList())

      override fun stringLike(stringLike: IResolvable) {
        cdkBuilder.stringLike(stringLike.let(IResolvable::unwrap))
      }

      override fun stringLike(stringLike: List<Any>) {
        cdkBuilder.stringLike(stringLike)
      }

      override fun stringLike(vararg stringLike: Any): Unit = stringLike(stringLike.toList())

      override fun stringNotEquals(stringNotEquals: IResolvable) {
        cdkBuilder.stringNotEquals(stringNotEquals.let(IResolvable::unwrap))
      }

      override fun stringNotEquals(stringNotEquals: List<Any>) {
        cdkBuilder.stringNotEquals(stringNotEquals)
      }

      override fun stringNotEquals(vararg stringNotEquals: Any): Unit =
          stringNotEquals(stringNotEquals.toList())

      override fun stringNotLike(stringNotLike: IResolvable) {
        cdkBuilder.stringNotLike(stringNotLike.let(IResolvable::unwrap))
      }

      override fun stringNotLike(stringNotLike: List<Any>) {
        cdkBuilder.stringNotLike(stringNotLike)
      }

      override fun stringNotLike(vararg stringNotLike: Any): Unit =
          stringNotLike(stringNotLike.toList())

      public fun build():
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty,
    ) : ConditionsProperty {
      override fun stringEquals(): Any? = unwrap(this).getStringEquals()

      override fun stringLike(): Any? = unwrap(this).getStringLike()

      override fun stringNotEquals(): Any? = unwrap(this).getStringNotEquals()

      override fun stringNotLike(): Any? = unwrap(this).getStringNotLike()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty):
          ConditionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionsProperty):
          software.amazon.awscdk.services.backup.CfnBackupSelection.ConditionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
