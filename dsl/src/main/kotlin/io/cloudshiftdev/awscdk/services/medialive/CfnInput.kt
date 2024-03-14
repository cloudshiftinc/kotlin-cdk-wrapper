package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInput internal constructor(
  private val cdkObject: software.amazon.awscdk.services.medialive.CfnInput,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDestinations(): List<String> = unwrap(this).getAttrDestinations() ?:
      emptyList()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrSources(): List<String> = unwrap(this).getAttrSources() ?: emptyList()

  public open fun destinations(): Any? = unwrap(this).getDestinations()

  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable::unwrap))
  }

  public open fun destinations(__idx_ac66f0: List<Any>) {
    unwrap(this).setDestinations(__idx_ac66f0)
  }

  public open fun inputDevices(): Any? = unwrap(this).getInputDevices()

  public open fun inputDevices(`value`: IResolvable) {
    unwrap(this).setInputDevices(`value`.let(IResolvable::unwrap))
  }

  public open fun inputDevices(__idx_ac66f0: List<Any>) {
    unwrap(this).setInputDevices(__idx_ac66f0)
  }

  public open fun inputSecurityGroups(): List<String> = unwrap(this).getInputSecurityGroups() ?:
      emptyList()

  public open fun inputSecurityGroups(`value`: List<String>) {
    unwrap(this).setInputSecurityGroups(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun mediaConnectFlows(): Any? = unwrap(this).getMediaConnectFlows()

  public open fun mediaConnectFlows(`value`: IResolvable) {
    unwrap(this).setMediaConnectFlows(`value`.let(IResolvable::unwrap))
  }

  public open fun mediaConnectFlows(__idx_ac66f0: List<Any>) {
    unwrap(this).setMediaConnectFlows(__idx_ac66f0)
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public open fun sources(): Any? = unwrap(this).getSources()

  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable::unwrap))
  }

  public open fun sources(__idx_ac66f0: List<Any>) {
    unwrap(this).setSources(__idx_ac66f0)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun vpc(): Any? = unwrap(this).getVpc()

  public open fun vpc(`value`: IResolvable) {
    unwrap(this).setVpc(`value`.let(IResolvable::unwrap))
  }

  public open fun vpc(`value`: InputVpcRequestProperty) {
    unwrap(this).setVpc(`value`.let(InputVpcRequestProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28a20a9aad3c4ef43702cfe4232243c32ff28216751bc2331074a70727d0c8f5")
  public open fun vpc(`value`: InputVpcRequestProperty.Builder.() -> Unit): Unit =
      vpc(InputVpcRequestProperty(`value`))

  public interface Builder {
    public fun destinations(destinations: IResolvable) {
    }

    public fun destinations(destinations: List<Any>) {
    }

    public fun inputDevices(inputDevices: IResolvable) {
    }

    public fun inputDevices(inputDevices: List<Any>) {
    }

    public fun inputSecurityGroups(inputSecurityGroups: List<String>) {
    }

    public fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
    }

    public fun mediaConnectFlows(mediaConnectFlows: List<Any>) {
    }

    public fun name(name: String) {
    }

    public fun roleArn(roleArn: String) {
    }

    public fun sources(sources: IResolvable) {
    }

    public fun sources(sources: List<Any>) {
    }

    public fun tags(tags: Any) {
    }

    public fun type(type: String) {
    }

    public fun vpc(vpc: IResolvable) {
    }

    public fun vpc(vpc: InputVpcRequestProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03d253b7a9d0d961b54013dff17b8657adbf7a55284ff688e0186c8c9f1a9123")
    public fun vpc(vpc: InputVpcRequestProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnInput.Builder =
        software.amazon.awscdk.services.medialive.CfnInput.Builder.create(scope, id)

    public override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    public override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    public override fun inputDevices(inputDevices: IResolvable) {
      cdkBuilder.inputDevices(inputDevices.let(IResolvable::unwrap))
    }

    public override fun inputDevices(inputDevices: List<Any>) {
      cdkBuilder.inputDevices(inputDevices)
    }

    public override fun inputSecurityGroups(inputSecurityGroups: List<String>) {
      cdkBuilder.inputSecurityGroups(inputSecurityGroups)
    }

    public override fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows.let(IResolvable::unwrap))
    }

    public override fun mediaConnectFlows(mediaConnectFlows: List<Any>) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    public override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    public override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    public override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
    }

    public override fun vpc(vpc: InputVpcRequestProperty) {
      cdkBuilder.vpc(vpc.let(InputVpcRequestProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03d253b7a9d0d961b54013dff17b8657adbf7a55284ff688e0186c8c9f1a9123")
    public override fun vpc(vpc: InputVpcRequestProperty.Builder.() -> Unit): Unit =
        vpc(InputVpcRequestProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnInput = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput): CfnInput =
        CfnInput(cdkObject)

    internal fun unwrap(wrapped: CfnInput): software.amazon.awscdk.services.medialive.CfnInput =
        wrapped.cdkObject
  }

  public interface InputSourceRequestProperty {
    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    public fun url(): String? = unwrap(this).getUrl()

    public fun username(): String? = unwrap(this).getUsername()

    public interface Builder {
      public fun passwordParam(passwordParam: String) {
      }

      public fun url(url: String) {
      }

      public fun username(username: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty.builder()

      public override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty,
    ) : InputSourceRequestProperty {
      public override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      public override fun url(): String? = unwrap(this).getUrl()

      public override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputSourceRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty):
          InputSourceRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSourceRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InputVpcRequestProperty {
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty.builder()

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public fun build(): software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty,
    ) : InputVpcRequestProperty {
      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputVpcRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty):
          InputVpcRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputVpcRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface InputDeviceSettingsProperty {
    public fun id(): String? = unwrap(this).getId()

    public interface Builder {
      public fun id(id: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty.builder()

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty,
    ) : InputDeviceSettingsProperty {
      public override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputDeviceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty):
          InputDeviceSettingsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputDeviceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InputDeviceRequestProperty {
    public fun id(): String? = unwrap(this).getId()

    public interface Builder {
      public fun id(id: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty.builder()

      public override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty,
    ) : InputDeviceRequestProperty {
      public override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputDeviceRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty):
          InputDeviceRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputDeviceRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface InputDestinationRequestProperty {
    public fun streamName(): String? = unwrap(this).getStreamName()

    public interface Builder {
      public fun streamName(streamName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty.builder()

      public override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty,
    ) : InputDestinationRequestProperty {
      public override fun streamName(): String? = unwrap(this).getStreamName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): InputDestinationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty):
          InputDestinationRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputDestinationRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MediaConnectFlowRequestProperty {
    public fun flowArn(): String? = unwrap(this).getFlowArn()

    public interface Builder {
      public fun flowArn(flowArn: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty.builder()

      public override fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty,
    ) : MediaConnectFlowRequestProperty {
      public override fun flowArn(): String? = unwrap(this).getFlowArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MediaConnectFlowRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty):
          MediaConnectFlowRequestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaConnectFlowRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
