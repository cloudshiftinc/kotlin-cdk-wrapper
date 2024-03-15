@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.comprehend

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDocumentClassifierProps {
  public fun dataAccessRoleArn(): String

  public fun documentClassifierName(): String

  public fun inputDataConfig(): Any

  public fun languageCode(): String

  public fun mode(): String? = unwrap(this).getMode()

  public fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

  public fun modelPolicy(): String? = unwrap(this).getModelPolicy()

  public fun outputDataConfig(): Any? = unwrap(this).getOutputDataConfig()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun versionName(): String? = unwrap(this).getVersionName()

  public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  @CdkDslMarker
  public interface Builder {
    public fun dataAccessRoleArn(dataAccessRoleArn: String)

    public fun documentClassifierName(documentClassifierName: String)

    public fun inputDataConfig(inputDataConfig: IResolvable)

    public
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5d4c31157dcb302fdac6a94fe272864e0d4ddb3d7f1f40213c6f50a4e392ea")
    public
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder.() -> Unit)

    public fun languageCode(languageCode: String)

    public fun mode(mode: String)

    public fun modelKmsKeyId(modelKmsKeyId: String)

    public fun modelPolicy(modelPolicy: String)

    public fun outputDataConfig(outputDataConfig: IResolvable)

    public
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06cc5ff8f83040bc905800ff5d7c7ceaf910dd255dc18eb34ca5bac946c2f")
    public
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun versionName(versionName: String)

    public fun volumeKmsKeyId(volumeKmsKeyId: String)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6a0bbde2404edb30c2b44538ba4a6e9fe1d2cfd8c7f4f840a55cd86f4965868")
    public fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps.Builder =
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps.builder()

    override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    override fun documentClassifierName(documentClassifierName: String) {
      cdkBuilder.documentClassifierName(documentClassifierName)
    }

    override fun inputDataConfig(inputDataConfig: IResolvable) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(IResolvable::unwrap))
    }

    override
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c5d4c31157dcb302fdac6a94fe272864e0d4ddb3d7f1f40213c6f50a4e392ea")
    override
        fun inputDataConfig(inputDataConfig: CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder.() -> Unit):
        Unit =
        inputDataConfig(CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty(inputDataConfig))

    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    override fun mode(mode: String) {
      cdkBuilder.mode(mode)
    }

    override fun modelKmsKeyId(modelKmsKeyId: String) {
      cdkBuilder.modelKmsKeyId(modelKmsKeyId)
    }

    override fun modelPolicy(modelPolicy: String) {
      cdkBuilder.modelPolicy(modelPolicy)
    }

    override fun outputDataConfig(outputDataConfig: IResolvable) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(IResolvable::unwrap))
    }

    override
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06cc5ff8f83040bc905800ff5d7c7ceaf910dd255dc18eb34ca5bac946c2f")
    override
        fun outputDataConfig(outputDataConfig: CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit):
        Unit =
        outputDataConfig(CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty(outputDataConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun versionName(versionName: String) {
      cdkBuilder.versionName(versionName)
    }

    override fun volumeKmsKeyId(volumeKmsKeyId: String) {
      cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
    }

    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
    }

    override fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnDocumentClassifier.VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d6a0bbde2404edb30c2b44538ba4a6e9fe1d2cfd8c7f4f840a55cd86f4965868")
    override fun vpcConfig(vpcConfig: CfnDocumentClassifier.VpcConfigProperty.Builder.() -> Unit):
        Unit = vpcConfig(CfnDocumentClassifier.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps,
  ) : CdkObject(cdkObject), CfnDocumentClassifierProps {
    override fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

    override fun documentClassifierName(): String = unwrap(this).getDocumentClassifierName()

    override fun inputDataConfig(): Any = unwrap(this).getInputDataConfig()

    override fun languageCode(): String = unwrap(this).getLanguageCode()

    override fun mode(): String? = unwrap(this).getMode()

    override fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

    override fun modelPolicy(): String? = unwrap(this).getModelPolicy()

    override fun outputDataConfig(): Any? = unwrap(this).getOutputDataConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun versionName(): String? = unwrap(this).getVersionName()

    override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDocumentClassifierProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps):
        CfnDocumentClassifierProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentClassifierProps):
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps
  }
}
