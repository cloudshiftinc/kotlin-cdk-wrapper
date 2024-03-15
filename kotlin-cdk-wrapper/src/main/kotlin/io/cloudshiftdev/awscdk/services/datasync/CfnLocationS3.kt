@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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

public open class CfnLocationS3 internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

  public open fun s3BucketArn(`value`: String) {
    unwrap(this).setS3BucketArn(`value`)
  }

  public open fun s3Config(): Any = unwrap(this).getS3Config()

  public open fun s3Config(`value`: IResolvable) {
    unwrap(this).setS3Config(`value`.let(IResolvable::unwrap))
  }

  public open fun s3Config(`value`: S3ConfigProperty) {
    unwrap(this).setS3Config(`value`.let(S3ConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5a6e7ca61727d4170a2f0d9a777ad77cf8936087a6b1ea7bf8bd0bcbe4eeaa5a")
  public open fun s3Config(`value`: S3ConfigProperty.Builder.() -> Unit): Unit =
      s3Config(S3ConfigProperty(`value`))

  public open fun s3StorageClass(): String? = unwrap(this).getS3StorageClass()

  public open fun s3StorageClass(`value`: String) {
    unwrap(this).setS3StorageClass(`value`)
  }

  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  @CdkDslMarker
  public interface Builder {
    public fun s3BucketArn(s3BucketArn: String)

    public fun s3Config(s3Config: IResolvable)

    public fun s3Config(s3Config: S3ConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2913a60c9b6a3ff55f01f98abaccc69c7b5f4891aa4a4f678f0b452c230c38f3")
    public fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit)

    public fun s3StorageClass(s3StorageClass: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationS3.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationS3.Builder.create(scope, id)

    override fun s3BucketArn(s3BucketArn: String) {
      cdkBuilder.s3BucketArn(s3BucketArn)
    }

    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
    }

    override fun s3Config(s3Config: S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(S3ConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2913a60c9b6a3ff55f01f98abaccc69c7b5f4891aa4a4f678f0b452c230c38f3")
    override fun s3Config(s3Config: S3ConfigProperty.Builder.() -> Unit): Unit =
        s3Config(S3ConfigProperty(s3Config))

    override fun s3StorageClass(s3StorageClass: String) {
      cdkBuilder.s3StorageClass(s3StorageClass)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationS3 = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.datasync.CfnLocationS3.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationS3 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationS3(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3):
        CfnLocationS3 = CfnLocationS3(cdkObject)

    internal fun unwrap(wrapped: CfnLocationS3):
        software.amazon.awscdk.services.datasync.CfnLocationS3 = wrapped.cdkObject
  }

  public interface S3ConfigProperty {
    public fun bucketAccessRoleArn(): String

    @CdkDslMarker
    public interface Builder {
      public fun bucketAccessRoleArn(bucketAccessRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty.Builder =
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty.builder()

      override fun bucketAccessRoleArn(bucketAccessRoleArn: String) {
        cdkBuilder.bucketAccessRoleArn(bucketAccessRoleArn)
      }

      public fun build(): software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty,
    ) : CdkObject(cdkObject), S3ConfigProperty {
      override fun bucketAccessRoleArn(): String = unwrap(this).getBucketAccessRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty):
          S3ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ConfigProperty):
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.datasync.CfnLocationS3.S3ConfigProperty
    }
  }
}
