@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLocationS3Props {
  public fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

  public fun s3Config(): Any

  public fun s3StorageClass(): String? = unwrap(this).getS3StorageClass()

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun s3BucketArn(s3BucketArn: String)

    public fun s3Config(s3Config: IResolvable)

    public fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36602e23301e64e538ec5a634904ced4b1a4f34987befb7e2042011e2a054ce8")
    public fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty.Builder.() -> Unit)

    public fun s3StorageClass(s3StorageClass: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationS3Props.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationS3Props.builder()

    override fun s3BucketArn(s3BucketArn: String) {
      cdkBuilder.s3BucketArn(s3BucketArn)
    }

    override fun s3Config(s3Config: IResolvable) {
      cdkBuilder.s3Config(s3Config.let(IResolvable::unwrap))
    }

    override fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty) {
      cdkBuilder.s3Config(s3Config.let(CfnLocationS3.S3ConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("36602e23301e64e538ec5a634904ced4b1a4f34987befb7e2042011e2a054ce8")
    override fun s3Config(s3Config: CfnLocationS3.S3ConfigProperty.Builder.() -> Unit): Unit =
        s3Config(CfnLocationS3.S3ConfigProperty(s3Config))

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

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationS3Props =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3Props,
  ) : CdkObject(cdkObject), CfnLocationS3Props {
    override fun s3BucketArn(): String? = unwrap(this).getS3BucketArn()

    override fun s3Config(): Any = unwrap(this).getS3Config()

    override fun s3StorageClass(): String? = unwrap(this).getS3StorageClass()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationS3Props {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationS3Props):
        CfnLocationS3Props = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationS3Props):
        software.amazon.awscdk.services.datasync.CfnLocationS3Props = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationS3Props
  }
}
