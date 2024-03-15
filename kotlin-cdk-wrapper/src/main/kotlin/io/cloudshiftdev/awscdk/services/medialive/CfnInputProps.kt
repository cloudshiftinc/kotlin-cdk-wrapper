@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnInputProps {
  public fun destinations(): Any? = unwrap(this).getDestinations()

  public fun inputDevices(): Any? = unwrap(this).getInputDevices()

  public fun inputSecurityGroups(): List<String> = unwrap(this).getInputSecurityGroups() ?:
      emptyList()

  public fun mediaConnectFlows(): Any? = unwrap(this).getMediaConnectFlows()

  public fun name(): String? = unwrap(this).getName()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun sources(): Any? = unwrap(this).getSources()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun type(): String? = unwrap(this).getType()

  public fun vpc(): Any? = unwrap(this).getVpc()

  @CdkDslMarker
  public interface Builder {
    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun inputDevices(inputDevices: IResolvable)

    public fun inputDevices(inputDevices: List<Any>)

    public fun inputDevices(vararg inputDevices: Any)

    public fun inputSecurityGroups(inputSecurityGroups: List<String>)

    public fun inputSecurityGroups(vararg inputSecurityGroups: String)

    public fun mediaConnectFlows(mediaConnectFlows: IResolvable)

    public fun mediaConnectFlows(mediaConnectFlows: List<Any>)

    public fun mediaConnectFlows(vararg mediaConnectFlows: Any)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun sources(sources: IResolvable)

    public fun sources(sources: List<Any>)

    public fun sources(vararg sources: Any)

    public fun tags(tags: Any)

    public fun type(type: String)

    public fun vpc(vpc: IResolvable)

    public fun vpc(vpc: CfnInput.InputVpcRequestProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eae357f6c95dedd1105307d2774e33375fd49905396a1804bb5edf7e6aa368c7")
    public fun vpc(vpc: CfnInput.InputVpcRequestProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnInputProps.Builder =
        software.amazon.awscdk.services.medialive.CfnInputProps.builder()

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    override fun inputDevices(inputDevices: IResolvable) {
      cdkBuilder.inputDevices(inputDevices.let(IResolvable::unwrap))
    }

    override fun inputDevices(inputDevices: List<Any>) {
      cdkBuilder.inputDevices(inputDevices)
    }

    override fun inputDevices(vararg inputDevices: Any): Unit = inputDevices(inputDevices.toList())

    override fun inputSecurityGroups(inputSecurityGroups: List<String>) {
      cdkBuilder.inputSecurityGroups(inputSecurityGroups)
    }

    override fun inputSecurityGroups(vararg inputSecurityGroups: String): Unit =
        inputSecurityGroups(inputSecurityGroups.toList())

    override fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows.let(IResolvable::unwrap))
    }

    override fun mediaConnectFlows(mediaConnectFlows: List<Any>) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows)
    }

    override fun mediaConnectFlows(vararg mediaConnectFlows: Any): Unit =
        mediaConnectFlows(mediaConnectFlows.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable::unwrap))
    }

    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources)
    }

    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
    }

    override fun vpc(vpc: CfnInput.InputVpcRequestProperty) {
      cdkBuilder.vpc(vpc.let(CfnInput.InputVpcRequestProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eae357f6c95dedd1105307d2774e33375fd49905396a1804bb5edf7e6aa368c7")
    override fun vpc(vpc: CfnInput.InputVpcRequestProperty.Builder.() -> Unit): Unit =
        vpc(CfnInput.InputVpcRequestProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnInputProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnInputProps,
  ) : CdkObject(cdkObject), CfnInputProps {
    override fun destinations(): Any? = unwrap(this).getDestinations()

    override fun inputDevices(): Any? = unwrap(this).getInputDevices()

    override fun inputSecurityGroups(): List<String> = unwrap(this).getInputSecurityGroups() ?:
        emptyList()

    override fun mediaConnectFlows(): Any? = unwrap(this).getMediaConnectFlows()

    override fun name(): String? = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun sources(): Any? = unwrap(this).getSources()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun type(): String? = unwrap(this).getType()

    override fun vpc(): Any? = unwrap(this).getVpc()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInputProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInputProps):
        CfnInputProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInputProps):
        software.amazon.awscdk.services.medialive.CfnInputProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.medialive.CfnInputProps
  }
}
