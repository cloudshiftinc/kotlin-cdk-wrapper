package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMitigationAction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun actionName(): String? = unwrap(this).getActionName()

  public open fun actionName(`value`: String) {
    unwrap(this).setActionName(`value`)
  }

  public open fun actionParams(): Any = unwrap(this).getActionParams()

  public open fun actionParams(`value`: IResolvable) {
    unwrap(this).setActionParams(`value`.let(IResolvable::unwrap))
  }

  public open fun actionParams(`value`: ActionParamsProperty) {
    unwrap(this).setActionParams(`value`.let(ActionParamsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4277dd54191b45938991cab9c779cfb5b3c064af6e3b1d0a0d2a8ef0c31fdc98")
  public open fun actionParams(`value`: ActionParamsProperty.Builder.() -> Unit): Unit =
      actionParams(ActionParamsProperty(`value`))

  public open fun attrMitigationActionArn(): String = unwrap(this).getAttrMitigationActionArn()

  public open fun attrMitigationActionId(): String = unwrap(this).getAttrMitigationActionId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun actionName(actionName: String) {
    }

    public fun actionParams(actionParams: IResolvable) {
    }

    public fun actionParams(actionParams: ActionParamsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94827d7ae4954a5b85a0e5f58a8b7663a47cd9b53b03e99ef47ab8d0ffdb6d45")
    public fun actionParams(actionParams: ActionParamsProperty.Builder.() -> Unit) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnMitigationAction.Builder =
        software.amazon.awscdk.services.iot.CfnMitigationAction.Builder.create(scope, id)

    public override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    public override fun actionParams(actionParams: IResolvable) {
      cdkBuilder.actionParams(actionParams.let(IResolvable::unwrap))
    }

    public override fun actionParams(actionParams: ActionParamsProperty) {
      cdkBuilder.actionParams(actionParams.let(ActionParamsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94827d7ae4954a5b85a0e5f58a8b7663a47cd9b53b03e99ef47ab8d0ffdb6d45")
    public override fun actionParams(actionParams: ActionParamsProperty.Builder.() -> Unit): Unit =
        actionParams(ActionParamsProperty(actionParams))

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iot.CfnMitigationAction = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMitigationAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMitigationAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction):
        CfnMitigationAction = CfnMitigationAction(cdkObject)

    internal fun unwrap(wrapped: CfnMitigationAction):
        software.amazon.awscdk.services.iot.CfnMitigationAction = wrapped.cdkObject
  }

  public interface ReplaceDefaultPolicyVersionParamsProperty {
    public fun templateName(): String

    public interface Builder {
      public fun templateName(templateName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty.builder()

      public override fun templateName(templateName: String) {
        cdkBuilder.templateName(templateName)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty,
    ) : ReplaceDefaultPolicyVersionParamsProperty {
      public override fun templateName(): String = unwrap(this).getTemplateName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ReplaceDefaultPolicyVersionParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty):
          ReplaceDefaultPolicyVersionParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReplaceDefaultPolicyVersionParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.ReplaceDefaultPolicyVersionParamsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PublishFindingToSnsParamsProperty {
    public fun topicArn(): String

    public interface Builder {
      public fun topicArn(topicArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty.builder()

      public override fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty,
    ) : PublishFindingToSnsParamsProperty {
      public override fun topicArn(): String = unwrap(this).getTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublishFindingToSnsParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty):
          PublishFindingToSnsParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublishFindingToSnsParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.PublishFindingToSnsParamsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface UpdateDeviceCertificateParamsProperty {
    public fun action(): String

    public interface Builder {
      public fun action(action: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty.builder()

      public override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty,
    ) : UpdateDeviceCertificateParamsProperty {
      public override fun action(): String = unwrap(this).getAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpdateDeviceCertificateParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty):
          UpdateDeviceCertificateParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateDeviceCertificateParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateDeviceCertificateParamsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ActionParamsProperty {
    public fun addThingsToThingGroupParams(): Any? = unwrap(this).getAddThingsToThingGroupParams()

    public fun enableIoTLoggingParams(): Any? = unwrap(this).getEnableIoTLoggingParams()

    public fun publishFindingToSnsParams(): Any? = unwrap(this).getPublishFindingToSnsParams()

    public fun replaceDefaultPolicyVersionParams(): Any? =
        unwrap(this).getReplaceDefaultPolicyVersionParams()

    public fun updateCaCertificateParams(): Any? = unwrap(this).getUpdateCaCertificateParams()

    public fun updateDeviceCertificateParams(): Any? =
        unwrap(this).getUpdateDeviceCertificateParams()

    public interface Builder {
      public fun addThingsToThingGroupParams(addThingsToThingGroupParams: IResolvable) {
      }

      public
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576250c58660aa14398d2e7acc9859fef027ac9e73834d8419d993fc670253b5")
      public
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty.Builder.() -> Unit) {
      }

      public fun enableIoTLoggingParams(enableIoTLoggingParams: IResolvable) {
      }

      public fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d11768dcffb11d427f4990380f183d8345e55cf5c7353d2b0500009afbe4946")
      public
          fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty.Builder.() -> Unit) {
      }

      public fun publishFindingToSnsParams(publishFindingToSnsParams: IResolvable) {
      }

      public
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ac44a0c3360a8ba7c389aba05f1cd5cb9c5ff079e4c46ee7986c31c45a1d57d")
      public
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty.Builder.() -> Unit) {
      }

      public fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: IResolvable) {
      }

      public
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da35d38e5876bb2eb3314310693a2a32262316b91a8d7b7ff5d930b155bbcde2")
      public
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty.Builder.() -> Unit) {
      }

      public fun updateCaCertificateParams(updateCaCertificateParams: IResolvable) {
      }

      public
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("922182c578eddfa5af1ac576b5a0fa17b7422973060aed72c1fd2559e3249ff1")
      public
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty.Builder.() -> Unit) {
      }

      public fun updateDeviceCertificateParams(updateDeviceCertificateParams: IResolvable) {
      }

      public
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef7506e8ba0ea83eeec6aa8cc9c18671ff5b693261e3f928b436dd47d01ba5d6")
      public
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty.Builder =
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty.builder()

      public override fun addThingsToThingGroupParams(addThingsToThingGroupParams: IResolvable) {
        cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams.let(IResolvable::unwrap))
      }

      public override
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty) {
        cdkBuilder.addThingsToThingGroupParams(addThingsToThingGroupParams.let(AddThingsToThingGroupParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("576250c58660aa14398d2e7acc9859fef027ac9e73834d8419d993fc670253b5")
      public override
          fun addThingsToThingGroupParams(addThingsToThingGroupParams: AddThingsToThingGroupParamsProperty.Builder.() -> Unit):
          Unit =
          addThingsToThingGroupParams(AddThingsToThingGroupParamsProperty(addThingsToThingGroupParams))

      public override fun enableIoTLoggingParams(enableIoTLoggingParams: IResolvable) {
        cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams.let(IResolvable::unwrap))
      }

      public override
          fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty) {
        cdkBuilder.enableIoTLoggingParams(enableIoTLoggingParams.let(EnableIoTLoggingParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9d11768dcffb11d427f4990380f183d8345e55cf5c7353d2b0500009afbe4946")
      public override
          fun enableIoTLoggingParams(enableIoTLoggingParams: EnableIoTLoggingParamsProperty.Builder.() -> Unit):
          Unit = enableIoTLoggingParams(EnableIoTLoggingParamsProperty(enableIoTLoggingParams))

      public override fun publishFindingToSnsParams(publishFindingToSnsParams: IResolvable) {
        cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams.let(IResolvable::unwrap))
      }

      public override
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty) {
        cdkBuilder.publishFindingToSnsParams(publishFindingToSnsParams.let(PublishFindingToSnsParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3ac44a0c3360a8ba7c389aba05f1cd5cb9c5ff079e4c46ee7986c31c45a1d57d")
      public override
          fun publishFindingToSnsParams(publishFindingToSnsParams: PublishFindingToSnsParamsProperty.Builder.() -> Unit):
          Unit =
          publishFindingToSnsParams(PublishFindingToSnsParamsProperty(publishFindingToSnsParams))

      public override
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: IResolvable) {
        cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams.let(IResolvable::unwrap))
      }

      public override
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty) {
        cdkBuilder.replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams.let(ReplaceDefaultPolicyVersionParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da35d38e5876bb2eb3314310693a2a32262316b91a8d7b7ff5d930b155bbcde2")
      public override
          fun replaceDefaultPolicyVersionParams(replaceDefaultPolicyVersionParams: ReplaceDefaultPolicyVersionParamsProperty.Builder.() -> Unit):
          Unit =
          replaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsProperty(replaceDefaultPolicyVersionParams))

      public override fun updateCaCertificateParams(updateCaCertificateParams: IResolvable) {
        cdkBuilder.updateCaCertificateParams(updateCaCertificateParams.let(IResolvable::unwrap))
      }

      public override
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty) {
        cdkBuilder.updateCaCertificateParams(updateCaCertificateParams.let(UpdateCACertificateParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("922182c578eddfa5af1ac576b5a0fa17b7422973060aed72c1fd2559e3249ff1")
      public override
          fun updateCaCertificateParams(updateCaCertificateParams: UpdateCACertificateParamsProperty.Builder.() -> Unit):
          Unit =
          updateCaCertificateParams(UpdateCACertificateParamsProperty(updateCaCertificateParams))

      public override
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: IResolvable) {
        cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams.let(IResolvable::unwrap))
      }

      public override
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty) {
        cdkBuilder.updateDeviceCertificateParams(updateDeviceCertificateParams.let(UpdateDeviceCertificateParamsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ef7506e8ba0ea83eeec6aa8cc9c18671ff5b693261e3f928b436dd47d01ba5d6")
      public override
          fun updateDeviceCertificateParams(updateDeviceCertificateParams: UpdateDeviceCertificateParamsProperty.Builder.() -> Unit):
          Unit =
          updateDeviceCertificateParams(UpdateDeviceCertificateParamsProperty(updateDeviceCertificateParams))

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty,
    ) : ActionParamsProperty {
      public override fun addThingsToThingGroupParams(): Any? =
          unwrap(this).getAddThingsToThingGroupParams()

      public override fun enableIoTLoggingParams(): Any? = unwrap(this).getEnableIoTLoggingParams()

      public override fun publishFindingToSnsParams(): Any? =
          unwrap(this).getPublishFindingToSnsParams()

      public override fun replaceDefaultPolicyVersionParams(): Any? =
          unwrap(this).getReplaceDefaultPolicyVersionParams()

      public override fun updateCaCertificateParams(): Any? =
          unwrap(this).getUpdateCaCertificateParams()

      public override fun updateDeviceCertificateParams(): Any? =
          unwrap(this).getUpdateDeviceCertificateParams()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty):
          ActionParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface UpdateCACertificateParamsProperty {
    public fun action(): String

    public interface Builder {
      public fun action(action: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty.builder()

      public override fun action(action: String) {
        cdkBuilder.action(action)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty,
    ) : UpdateCACertificateParamsProperty {
      public override fun action(): String = unwrap(this).getAction()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          UpdateCACertificateParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty):
          UpdateCACertificateParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: UpdateCACertificateParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.UpdateCACertificateParamsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AddThingsToThingGroupParamsProperty {
    public fun overrideDynamicGroups(): Any? = unwrap(this).getOverrideDynamicGroups()

    public fun thingGroupNames(): List<String>

    public interface Builder {
      public fun overrideDynamicGroups(overrideDynamicGroups: Boolean) {
      }

      public fun overrideDynamicGroups(overrideDynamicGroups: IResolvable) {
      }

      public fun thingGroupNames(thingGroupNames: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty.builder()

      public override fun overrideDynamicGroups(overrideDynamicGroups: Boolean) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups)
      }

      public override fun overrideDynamicGroups(overrideDynamicGroups: IResolvable) {
        cdkBuilder.overrideDynamicGroups(overrideDynamicGroups.let(IResolvable::unwrap))
      }

      public override fun thingGroupNames(thingGroupNames: List<String>) {
        cdkBuilder.thingGroupNames(thingGroupNames)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty,
    ) : AddThingsToThingGroupParamsProperty {
      public override fun overrideDynamicGroups(): Any? = unwrap(this).getOverrideDynamicGroups()

      public override fun thingGroupNames(): List<String> = unwrap(this).getThingGroupNames() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AddThingsToThingGroupParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty):
          AddThingsToThingGroupParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddThingsToThingGroupParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.AddThingsToThingGroupParamsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface EnableIoTLoggingParamsProperty {
    public fun logLevel(): String

    public fun roleArnForLogging(): String

    public interface Builder {
      public fun logLevel(logLevel: String) {
      }

      public fun roleArnForLogging(roleArnForLogging: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty.builder()

      public override fun logLevel(logLevel: String) {
        cdkBuilder.logLevel(logLevel)
      }

      public override fun roleArnForLogging(roleArnForLogging: String) {
        cdkBuilder.roleArnForLogging(roleArnForLogging)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty,
    ) : EnableIoTLoggingParamsProperty {
      public override fun logLevel(): String = unwrap(this).getLogLevel()

      public override fun roleArnForLogging(): String = unwrap(this).getRoleArnForLogging()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EnableIoTLoggingParamsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty):
          EnableIoTLoggingParamsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EnableIoTLoggingParamsProperty):
          software.amazon.awscdk.services.iot.CfnMitigationAction.EnableIoTLoggingParamsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
