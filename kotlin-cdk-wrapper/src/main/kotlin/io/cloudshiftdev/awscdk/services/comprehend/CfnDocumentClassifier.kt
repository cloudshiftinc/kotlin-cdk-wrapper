@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.comprehend

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDocumentClassifier internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

  public open fun dataAccessRoleArn(`value`: String) {
    unwrap(this).setDataAccessRoleArn(`value`)
  }

  public open fun documentClassifierName(): String = unwrap(this).getDocumentClassifierName()

  public open fun documentClassifierName(`value`: String) {
    unwrap(this).setDocumentClassifierName(`value`)
  }

  public open fun inputDataConfig(): Any = unwrap(this).getInputDataConfig()

  public open fun inputDataConfig(`value`: IResolvable) {
    unwrap(this).setInputDataConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun inputDataConfig(`value`: DocumentClassifierInputDataConfigProperty) {
    unwrap(this).setInputDataConfig(`value`.let(DocumentClassifierInputDataConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fa845bb8996e2d07951639209aea7266e697e921518a043a100313a831a7a0c9")
  public open
      fun inputDataConfig(`value`: DocumentClassifierInputDataConfigProperty.Builder.() -> Unit):
      Unit = inputDataConfig(DocumentClassifierInputDataConfigProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun languageCode(): String = unwrap(this).getLanguageCode()

  public open fun languageCode(`value`: String) {
    unwrap(this).setLanguageCode(`value`)
  }

  public open fun mode(): String? = unwrap(this).getMode()

  public open fun mode(`value`: String) {
    unwrap(this).setMode(`value`)
  }

  public open fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

  public open fun modelKmsKeyId(`value`: String) {
    unwrap(this).setModelKmsKeyId(`value`)
  }

  public open fun modelPolicy(): String? = unwrap(this).getModelPolicy()

  public open fun modelPolicy(`value`: String) {
    unwrap(this).setModelPolicy(`value`)
  }

  public open fun outputDataConfig(): Any? = unwrap(this).getOutputDataConfig()

  public open fun outputDataConfig(`value`: IResolvable) {
    unwrap(this).setOutputDataConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun outputDataConfig(`value`: DocumentClassifierOutputDataConfigProperty) {
    unwrap(this).setOutputDataConfig(`value`.let(DocumentClassifierOutputDataConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("12291ffa32da101ef8fdf0f59c198fd5baee02364473cdd77af792e863bcc29f")
  public open
      fun outputDataConfig(`value`: DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit):
      Unit = outputDataConfig(DocumentClassifierOutputDataConfigProperty(`value`))

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public open fun versionName(): String? = unwrap(this).getVersionName()

  public open fun versionName(`value`: String) {
    unwrap(this).setVersionName(`value`)
  }

  public open fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

  public open fun volumeKmsKeyId(`value`: String) {
    unwrap(this).setVolumeKmsKeyId(`value`)
  }

  public open fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  public open fun vpcConfig(`value`: IResolvable) {
    unwrap(this).setVpcConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConfig(`value`: VpcConfigProperty) {
    unwrap(this).setVpcConfig(`value`.let(VpcConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("efa89925a77ec2e26545949702e175f110c7053f8d1732360de1563d47e1c6f8")
  public open fun vpcConfig(`value`: VpcConfigProperty.Builder.() -> Unit): Unit =
      vpcConfig(VpcConfigProperty(`value`))

  @CdkDslMarker
  public interface Builder {
    public fun dataAccessRoleArn(dataAccessRoleArn: String)

    public fun documentClassifierName(documentClassifierName: String)

    public fun inputDataConfig(inputDataConfig: IResolvable)

    public fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ead844577296208fa182b5d35956d753a0389f6213608c2de7573aeaac3511c9")
    public
        fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty.Builder.() -> Unit)

    public fun languageCode(languageCode: String)

    public fun mode(mode: String)

    public fun modelKmsKeyId(modelKmsKeyId: String)

    public fun modelPolicy(modelPolicy: String)

    public fun outputDataConfig(outputDataConfig: IResolvable)

    public fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("042164220275f5e173eed7aa0b7339bb447218978d0fa011149f7b206a8ecc8f")
    public
        fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun versionName(versionName: String)

    public fun volumeKmsKeyId(volumeKmsKeyId: String)

    public fun vpcConfig(vpcConfig: IResolvable)

    public fun vpcConfig(vpcConfig: VpcConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dec6a95827b49471469399ea4357f96c18cdef6b0e07e9f74ffd43ec8ed69e6")
    public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.Builder
        = software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.Builder.create(scope, id)

    override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    override fun documentClassifierName(documentClassifierName: String) {
      cdkBuilder.documentClassifierName(documentClassifierName)
    }

    override fun inputDataConfig(inputDataConfig: IResolvable) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(IResolvable::unwrap))
    }

    override fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty) {
      cdkBuilder.inputDataConfig(inputDataConfig.let(DocumentClassifierInputDataConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ead844577296208fa182b5d35956d753a0389f6213608c2de7573aeaac3511c9")
    override
        fun inputDataConfig(inputDataConfig: DocumentClassifierInputDataConfigProperty.Builder.() -> Unit):
        Unit = inputDataConfig(DocumentClassifierInputDataConfigProperty(inputDataConfig))

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

    override fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty) {
      cdkBuilder.outputDataConfig(outputDataConfig.let(DocumentClassifierOutputDataConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("042164220275f5e173eed7aa0b7339bb447218978d0fa011149f7b206a8ecc8f")
    override
        fun outputDataConfig(outputDataConfig: DocumentClassifierOutputDataConfigProperty.Builder.() -> Unit):
        Unit = outputDataConfig(DocumentClassifierOutputDataConfigProperty(outputDataConfig))

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

    override fun vpcConfig(vpcConfig: VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2dec6a95827b49471469399ea4357f96c18cdef6b0e07e9f74ffd43ec8ed69e6")
    override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnDocumentClassifier =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDocumentClassifier {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDocumentClassifier(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier):
        CfnDocumentClassifier = CfnDocumentClassifier(cdkObject)

    internal fun unwrap(wrapped: CfnDocumentClassifier):
        software.amazon.awscdk.services.comprehend.CfnDocumentClassifier = wrapped.cdkObject
  }

  public interface DocumentReaderConfigProperty {
    public fun documentReadAction(): String

    public fun documentReadMode(): String? = unwrap(this).getDocumentReadMode()

    public fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()

    @CdkDslMarker
    public interface Builder {
      public fun documentReadAction(documentReadAction: String)

      public fun documentReadMode(documentReadMode: String)

      public fun featureTypes(featureTypes: List<String>)

      public fun featureTypes(vararg featureTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty.builder()

      override fun documentReadAction(documentReadAction: String) {
        cdkBuilder.documentReadAction(documentReadAction)
      }

      override fun documentReadMode(documentReadMode: String) {
        cdkBuilder.documentReadMode(documentReadMode)
      }

      override fun featureTypes(featureTypes: List<String>) {
        cdkBuilder.featureTypes(featureTypes)
      }

      override fun featureTypes(vararg featureTypes: String): Unit =
          featureTypes(featureTypes.toList())

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty,
    ) : CdkObject(cdkObject), DocumentReaderConfigProperty {
      override fun documentReadAction(): String = unwrap(this).getDocumentReadAction()

      override fun documentReadMode(): String? = unwrap(this).getDocumentReadMode()

      override fun featureTypes(): List<String> = unwrap(this).getFeatureTypes() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DocumentReaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty):
          DocumentReaderConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentReaderConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentReaderConfigProperty
    }
  }

  public interface DocumentClassifierDocumentsProperty {
    public fun s3Uri(): String

    public fun testS3Uri(): String? = unwrap(this).getTestS3Uri()

    @CdkDslMarker
    public interface Builder {
      public fun s3Uri(s3Uri: String)

      public fun testS3Uri(testS3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty.builder()

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      override fun testS3Uri(testS3Uri: String) {
        cdkBuilder.testS3Uri(testS3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty,
    ) : CdkObject(cdkObject), DocumentClassifierDocumentsProperty {
      override fun s3Uri(): String = unwrap(this).getS3Uri()

      override fun testS3Uri(): String? = unwrap(this).getTestS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassifierDocumentsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty):
          DocumentClassifierDocumentsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassifierDocumentsProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierDocumentsProperty
    }
  }

  public interface DocumentClassifierInputDataConfigProperty {
    public fun augmentedManifests(): Any? = unwrap(this).getAugmentedManifests()

    public fun dataFormat(): String? = unwrap(this).getDataFormat()

    public fun documentReaderConfig(): Any? = unwrap(this).getDocumentReaderConfig()

    public fun documentType(): String? = unwrap(this).getDocumentType()

    public fun documents(): Any? = unwrap(this).getDocuments()

    public fun labelDelimiter(): String? = unwrap(this).getLabelDelimiter()

    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    public fun testS3Uri(): String? = unwrap(this).getTestS3Uri()

    @CdkDslMarker
    public interface Builder {
      public fun augmentedManifests(augmentedManifests: IResolvable)

      public fun augmentedManifests(augmentedManifests: List<Any>)

      public fun augmentedManifests(vararg augmentedManifests: Any)

      public fun dataFormat(dataFormat: String)

      public fun documentReaderConfig(documentReaderConfig: IResolvable)

      public fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("519b411b789a1ad772bfb7eb17d0edf75e33b4fb53670cdcc45bf87398c2eb16")
      public
          fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty.Builder.() -> Unit)

      public fun documentType(documentType: String)

      public fun documents(documents: IResolvable)

      public fun documents(documents: DocumentClassifierDocumentsProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7748e5335ba3bb7e210f124dc3f55569cf05ba479b2c865e0b3f4bc3b087b97b")
      public fun documents(documents: DocumentClassifierDocumentsProperty.Builder.() -> Unit)

      public fun labelDelimiter(labelDelimiter: String)

      public fun s3Uri(s3Uri: String)

      public fun testS3Uri(testS3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty.builder()

      override fun augmentedManifests(augmentedManifests: IResolvable) {
        cdkBuilder.augmentedManifests(augmentedManifests.let(IResolvable::unwrap))
      }

      override fun augmentedManifests(augmentedManifests: List<Any>) {
        cdkBuilder.augmentedManifests(augmentedManifests)
      }

      override fun augmentedManifests(vararg augmentedManifests: Any): Unit =
          augmentedManifests(augmentedManifests.toList())

      override fun dataFormat(dataFormat: String) {
        cdkBuilder.dataFormat(dataFormat)
      }

      override fun documentReaderConfig(documentReaderConfig: IResolvable) {
        cdkBuilder.documentReaderConfig(documentReaderConfig.let(IResolvable::unwrap))
      }

      override fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty) {
        cdkBuilder.documentReaderConfig(documentReaderConfig.let(DocumentReaderConfigProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("519b411b789a1ad772bfb7eb17d0edf75e33b4fb53670cdcc45bf87398c2eb16")
      override
          fun documentReaderConfig(documentReaderConfig: DocumentReaderConfigProperty.Builder.() -> Unit):
          Unit = documentReaderConfig(DocumentReaderConfigProperty(documentReaderConfig))

      override fun documentType(documentType: String) {
        cdkBuilder.documentType(documentType)
      }

      override fun documents(documents: IResolvable) {
        cdkBuilder.documents(documents.let(IResolvable::unwrap))
      }

      override fun documents(documents: DocumentClassifierDocumentsProperty) {
        cdkBuilder.documents(documents.let(DocumentClassifierDocumentsProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7748e5335ba3bb7e210f124dc3f55569cf05ba479b2c865e0b3f4bc3b087b97b")
      override fun documents(documents: DocumentClassifierDocumentsProperty.Builder.() -> Unit):
          Unit = documents(DocumentClassifierDocumentsProperty(documents))

      override fun labelDelimiter(labelDelimiter: String) {
        cdkBuilder.labelDelimiter(labelDelimiter)
      }

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      override fun testS3Uri(testS3Uri: String) {
        cdkBuilder.testS3Uri(testS3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty,
    ) : CdkObject(cdkObject), DocumentClassifierInputDataConfigProperty {
      override fun augmentedManifests(): Any? = unwrap(this).getAugmentedManifests()

      override fun dataFormat(): String? = unwrap(this).getDataFormat()

      override fun documentReaderConfig(): Any? = unwrap(this).getDocumentReaderConfig()

      override fun documentType(): String? = unwrap(this).getDocumentType()

      override fun documents(): Any? = unwrap(this).getDocuments()

      override fun labelDelimiter(): String? = unwrap(this).getLabelDelimiter()

      override fun s3Uri(): String? = unwrap(this).getS3Uri()

      override fun testS3Uri(): String? = unwrap(this).getTestS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassifierInputDataConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty):
          DocumentClassifierInputDataConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassifierInputDataConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty
    }
  }

  public interface DocumentClassifierOutputDataConfigProperty {
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    public fun s3Uri(): String? = unwrap(this).getS3Uri()

    @CdkDslMarker
    public interface Builder {
      public fun kmsKeyId(kmsKeyId: String)

      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty.builder()

      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty,
    ) : CdkObject(cdkObject), DocumentClassifierOutputDataConfigProperty {
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      override fun s3Uri(): String? = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassifierOutputDataConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty):
          DocumentClassifierOutputDataConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassifierOutputDataConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty
    }
  }

  public interface AugmentedManifestsListItemProperty {
    public fun attributeNames(): List<String>

    public fun s3Uri(): String

    public fun split(): String? = unwrap(this).getSplit()

    @CdkDslMarker
    public interface Builder {
      public fun attributeNames(attributeNames: List<String>)

      public fun attributeNames(vararg attributeNames: String)

      public fun s3Uri(s3Uri: String)

      public fun split(split: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty.builder()

      override fun attributeNames(attributeNames: List<String>) {
        cdkBuilder.attributeNames(attributeNames)
      }

      override fun attributeNames(vararg attributeNames: String): Unit =
          attributeNames(attributeNames.toList())

      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      override fun split(split: String) {
        cdkBuilder.split(split)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty,
    ) : CdkObject(cdkObject), AugmentedManifestsListItemProperty {
      override fun attributeNames(): List<String> = unwrap(this).getAttributeNames()

      override fun s3Uri(): String = unwrap(this).getS3Uri()

      override fun split(): String? = unwrap(this).getSplit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AugmentedManifestsListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty):
          AugmentedManifestsListItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AugmentedManifestsListItemProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.AugmentedManifestsListItemProperty
    }
  }

  public interface VpcConfigProperty {
    public fun securityGroupIds(): List<String>

    public fun subnets(): List<String>

    @CdkDslMarker
    public interface Builder {
      public fun securityGroupIds(securityGroupIds: List<String>)

      public fun securityGroupIds(vararg securityGroupIds: String)

      public fun subnets(subnets: List<String>)

      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty.builder()

      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty):
          VpcConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnDocumentClassifier.VpcConfigProperty
    }
  }
}
