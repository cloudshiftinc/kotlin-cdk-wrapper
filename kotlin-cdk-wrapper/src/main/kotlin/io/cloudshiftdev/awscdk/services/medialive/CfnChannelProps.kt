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

public interface CfnChannelProps {
  public fun cdiInputSpecification(): Any? = unwrap(this).getCdiInputSpecification()

  public fun channelClass(): String? = unwrap(this).getChannelClass()

  public fun destinations(): Any? = unwrap(this).getDestinations()

  public fun encoderSettings(): Any? = unwrap(this).getEncoderSettings()

  public fun inputAttachments(): Any? = unwrap(this).getInputAttachments()

  public fun inputSpecification(): Any? = unwrap(this).getInputSpecification()

  public fun logLevel(): String? = unwrap(this).getLogLevel()

  public fun maintenance(): Any? = unwrap(this).getMaintenance()

  public fun name(): String? = unwrap(this).getName()

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun vpc(): Any? = unwrap(this).getVpc()

  @CdkDslMarker
  public interface Builder {
    public fun cdiInputSpecification(cdiInputSpecification: IResolvable)

    public
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52ba2855cc08703a2ee9589e7588fca51b73169c3f98d0b2a6c8b5f12054cc70")
    public
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty.Builder.() -> Unit)

    public fun channelClass(channelClass: String)

    public fun destinations(destinations: IResolvable)

    public fun destinations(destinations: List<Any>)

    public fun destinations(vararg destinations: Any)

    public fun encoderSettings(encoderSettings: IResolvable)

    public fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcc0ec157b308f78a2307c9a7bd27a270ddd63e1e272ff10176969a7c49315d1")
    public
        fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty.Builder.() -> Unit)

    public fun inputAttachments(inputAttachments: IResolvable)

    public fun inputAttachments(inputAttachments: List<Any>)

    public fun inputAttachments(vararg inputAttachments: Any)

    public fun inputSpecification(inputSpecification: IResolvable)

    public fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c97a796698ebfa128c571ba04b8d30492718a217b66ee1a20596fd9355025f5f")
    public
        fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty.Builder.() -> Unit)

    public fun logLevel(logLevel: String)

    public fun maintenance(maintenance: IResolvable)

    public fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12bd38dbc8d3d9620b8cd2d869aa04a7d2f8c82809b2fee60bb5cc1cb24d15af")
    public
        fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: Any)

    public fun vpc(vpc: IResolvable)

    public fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42009d47de4603978b65045987df80f3ef9a4317bc05191e371fd107c682eae4")
    public fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnChannelProps.Builder =
        software.amazon.awscdk.services.medialive.CfnChannelProps.builder()

    override fun cdiInputSpecification(cdiInputSpecification: IResolvable) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(IResolvable::unwrap))
    }

    override
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty) {
      cdkBuilder.cdiInputSpecification(cdiInputSpecification.let(CfnChannel.CdiInputSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52ba2855cc08703a2ee9589e7588fca51b73169c3f98d0b2a6c8b5f12054cc70")
    override
        fun cdiInputSpecification(cdiInputSpecification: CfnChannel.CdiInputSpecificationProperty.Builder.() -> Unit):
        Unit =
        cdiInputSpecification(CfnChannel.CdiInputSpecificationProperty(cdiInputSpecification))

    override fun channelClass(channelClass: String) {
      cdkBuilder.channelClass(channelClass)
    }

    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
    }

    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations)
    }

    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    override fun encoderSettings(encoderSettings: IResolvable) {
      cdkBuilder.encoderSettings(encoderSettings.let(IResolvable::unwrap))
    }

    override fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty) {
      cdkBuilder.encoderSettings(encoderSettings.let(CfnChannel.EncoderSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dcc0ec157b308f78a2307c9a7bd27a270ddd63e1e272ff10176969a7c49315d1")
    override
        fun encoderSettings(encoderSettings: CfnChannel.EncoderSettingsProperty.Builder.() -> Unit):
        Unit = encoderSettings(CfnChannel.EncoderSettingsProperty(encoderSettings))

    override fun inputAttachments(inputAttachments: IResolvable) {
      cdkBuilder.inputAttachments(inputAttachments.let(IResolvable::unwrap))
    }

    override fun inputAttachments(inputAttachments: List<Any>) {
      cdkBuilder.inputAttachments(inputAttachments)
    }

    override fun inputAttachments(vararg inputAttachments: Any): Unit =
        inputAttachments(inputAttachments.toList())

    override fun inputSpecification(inputSpecification: IResolvable) {
      cdkBuilder.inputSpecification(inputSpecification.let(IResolvable::unwrap))
    }

    override fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty) {
      cdkBuilder.inputSpecification(inputSpecification.let(CfnChannel.InputSpecificationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c97a796698ebfa128c571ba04b8d30492718a217b66ee1a20596fd9355025f5f")
    override
        fun inputSpecification(inputSpecification: CfnChannel.InputSpecificationProperty.Builder.() -> Unit):
        Unit = inputSpecification(CfnChannel.InputSpecificationProperty(inputSpecification))

    override fun logLevel(logLevel: String) {
      cdkBuilder.logLevel(logLevel)
    }

    override fun maintenance(maintenance: IResolvable) {
      cdkBuilder.maintenance(maintenance.let(IResolvable::unwrap))
    }

    override fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty) {
      cdkBuilder.maintenance(maintenance.let(CfnChannel.MaintenanceCreateSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12bd38dbc8d3d9620b8cd2d869aa04a7d2f8c82809b2fee60bb5cc1cb24d15af")
    override
        fun maintenance(maintenance: CfnChannel.MaintenanceCreateSettingsProperty.Builder.() -> Unit):
        Unit = maintenance(CfnChannel.MaintenanceCreateSettingsProperty(maintenance))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable::unwrap))
    }

    override fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty) {
      cdkBuilder.vpc(vpc.let(CfnChannel.VpcOutputSettingsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("42009d47de4603978b65045987df80f3ef9a4317bc05191e371fd107c682eae4")
    override fun vpc(vpc: CfnChannel.VpcOutputSettingsProperty.Builder.() -> Unit): Unit =
        vpc(CfnChannel.VpcOutputSettingsProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnChannelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.medialive.CfnChannelProps,
  ) : CdkObject(cdkObject), CfnChannelProps {
    override fun cdiInputSpecification(): Any? = unwrap(this).getCdiInputSpecification()

    override fun channelClass(): String? = unwrap(this).getChannelClass()

    override fun destinations(): Any? = unwrap(this).getDestinations()

    override fun encoderSettings(): Any? = unwrap(this).getEncoderSettings()

    override fun inputAttachments(): Any? = unwrap(this).getInputAttachments()

    override fun inputSpecification(): Any? = unwrap(this).getInputSpecification()

    override fun logLevel(): String? = unwrap(this).getLogLevel()

    override fun maintenance(): Any? = unwrap(this).getMaintenance()

    override fun name(): String? = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun vpc(): Any? = unwrap(this).getVpc()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnChannelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnChannelProps):
        CfnChannelProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnChannelProps):
        software.amazon.awscdk.services.medialive.CfnChannelProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.medialive.CfnChannelProps
  }
}
