@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.osis

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnPipelineProps {
  public fun bufferOptions(): Any? = unwrap(this).getBufferOptions()

  public fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

  public fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

  public fun maxUnits(): Number

  public fun minUnits(): Number

  public fun pipelineConfigurationBody(): String

  public fun pipelineName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun vpcOptions(): Any? = unwrap(this).getVpcOptions()

  @CdkDslMarker
  public interface Builder {
    public fun bufferOptions(bufferOptions: IResolvable)

    public fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d0de03db58e944840acf56075fb0773f9a2fdac31c30644359a057675c2ce6a")
    public fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty.Builder.() -> Unit)

    public fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable)

    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32ce6e1481f6149d47367b7798633f7b4788e228f5426242098072216524bf18")
    public
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty.Builder.() -> Unit)

    public fun logPublishingOptions(logPublishingOptions: IResolvable)

    public fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa9dc3615523662a1844974ce19047e63b9254ba594714dd88be3d14ab667364")
    public
        fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty.Builder.() -> Unit)

    public fun maxUnits(maxUnits: Number)

    public fun minUnits(minUnits: Number)

    public fun pipelineConfigurationBody(pipelineConfigurationBody: String)

    public fun pipelineName(pipelineName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun vpcOptions(vpcOptions: IResolvable)

    public fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("284a05bce2e7d218f7ae32de2ef72aaf0dc3a594e59cdbdbd810d3df701f1ffc")
    public fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.osis.CfnPipelineProps.Builder =
        software.amazon.awscdk.services.osis.CfnPipelineProps.builder()

    override fun bufferOptions(bufferOptions: IResolvable) {
      cdkBuilder.bufferOptions(bufferOptions.let(IResolvable::unwrap))
    }

    override fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty) {
      cdkBuilder.bufferOptions(bufferOptions.let(CfnPipeline.BufferOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9d0de03db58e944840acf56075fb0773f9a2fdac31c30644359a057675c2ce6a")
    override fun bufferOptions(bufferOptions: CfnPipeline.BufferOptionsProperty.Builder.() -> Unit):
        Unit = bufferOptions(CfnPipeline.BufferOptionsProperty(bufferOptions))

    override fun encryptionAtRestOptions(encryptionAtRestOptions: IResolvable) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(IResolvable::unwrap))
    }

    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty) {
      cdkBuilder.encryptionAtRestOptions(encryptionAtRestOptions.let(CfnPipeline.EncryptionAtRestOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("32ce6e1481f6149d47367b7798633f7b4788e228f5426242098072216524bf18")
    override
        fun encryptionAtRestOptions(encryptionAtRestOptions: CfnPipeline.EncryptionAtRestOptionsProperty.Builder.() -> Unit):
        Unit =
        encryptionAtRestOptions(CfnPipeline.EncryptionAtRestOptionsProperty(encryptionAtRestOptions))

    override fun logPublishingOptions(logPublishingOptions: IResolvable) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(IResolvable::unwrap))
    }

    override
        fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty) {
      cdkBuilder.logPublishingOptions(logPublishingOptions.let(CfnPipeline.LogPublishingOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa9dc3615523662a1844974ce19047e63b9254ba594714dd88be3d14ab667364")
    override
        fun logPublishingOptions(logPublishingOptions: CfnPipeline.LogPublishingOptionsProperty.Builder.() -> Unit):
        Unit = logPublishingOptions(CfnPipeline.LogPublishingOptionsProperty(logPublishingOptions))

    override fun maxUnits(maxUnits: Number) {
      cdkBuilder.maxUnits(maxUnits)
    }

    override fun minUnits(minUnits: Number) {
      cdkBuilder.minUnits(minUnits)
    }

    override fun pipelineConfigurationBody(pipelineConfigurationBody: String) {
      cdkBuilder.pipelineConfigurationBody(pipelineConfigurationBody)
    }

    override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun vpcOptions(vpcOptions: IResolvable) {
      cdkBuilder.vpcOptions(vpcOptions.let(IResolvable::unwrap))
    }

    override fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty) {
      cdkBuilder.vpcOptions(vpcOptions.let(CfnPipeline.VpcOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("284a05bce2e7d218f7ae32de2ef72aaf0dc3a594e59cdbdbd810d3df701f1ffc")
    override fun vpcOptions(vpcOptions: CfnPipeline.VpcOptionsProperty.Builder.() -> Unit): Unit =
        vpcOptions(CfnPipeline.VpcOptionsProperty(vpcOptions))

    public fun build(): software.amazon.awscdk.services.osis.CfnPipelineProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.osis.CfnPipelineProps,
  ) : CdkObject(cdkObject), CfnPipelineProps {
    override fun bufferOptions(): Any? = unwrap(this).getBufferOptions()

    override fun encryptionAtRestOptions(): Any? = unwrap(this).getEncryptionAtRestOptions()

    override fun logPublishingOptions(): Any? = unwrap(this).getLogPublishingOptions()

    override fun maxUnits(): Number = unwrap(this).getMaxUnits()

    override fun minUnits(): Number = unwrap(this).getMinUnits()

    override fun pipelineConfigurationBody(): String = unwrap(this).getPipelineConfigurationBody()

    override fun pipelineName(): String = unwrap(this).getPipelineName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun vpcOptions(): Any? = unwrap(this).getVpcOptions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPipelineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.osis.CfnPipelineProps):
        CfnPipelineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPipelineProps):
        software.amazon.awscdk.services.osis.CfnPipelineProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.osis.CfnPipelineProps
  }
}
