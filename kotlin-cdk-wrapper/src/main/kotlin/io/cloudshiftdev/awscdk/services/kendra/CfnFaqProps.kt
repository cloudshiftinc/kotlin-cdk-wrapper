@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kendra

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnFaqProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun fileFormat(): String? = unwrap(this).getFileFormat()

  public fun indexId(): String

  public fun languageCode(): String? = unwrap(this).getLanguageCode()

  public fun name(): String

  public fun roleArn(): String

  public fun s3Path(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun fileFormat(fileFormat: String)

    public fun indexId(indexId: String)

    public fun languageCode(languageCode: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun s3Path(s3Path: IResolvable)

    public fun s3Path(s3Path: CfnFaq.S3PathProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28942ef96ec3eba1e198857272a2ab193774b3114e655be715d32fc24fc396f2")
    public fun s3Path(s3Path: CfnFaq.S3PathProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendra.CfnFaqProps.Builder =
        software.amazon.awscdk.services.kendra.CfnFaqProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun fileFormat(fileFormat: String) {
      cdkBuilder.fileFormat(fileFormat)
    }

    override fun indexId(indexId: String) {
      cdkBuilder.indexId(indexId)
    }

    override fun languageCode(languageCode: String) {
      cdkBuilder.languageCode(languageCode)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun s3Path(s3Path: IResolvable) {
      cdkBuilder.s3Path(s3Path.let(IResolvable::unwrap))
    }

    override fun s3Path(s3Path: CfnFaq.S3PathProperty) {
      cdkBuilder.s3Path(s3Path.let(CfnFaq.S3PathProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28942ef96ec3eba1e198857272a2ab193774b3114e655be715d32fc24fc396f2")
    override fun s3Path(s3Path: CfnFaq.S3PathProperty.Builder.() -> Unit): Unit =
        s3Path(CfnFaq.S3PathProperty(s3Path))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendra.CfnFaqProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.kendra.CfnFaqProps,
  ) : CdkObject(cdkObject), CfnFaqProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun fileFormat(): String? = unwrap(this).getFileFormat()

    override fun indexId(): String = unwrap(this).getIndexId()

    override fun languageCode(): String? = unwrap(this).getLanguageCode()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun s3Path(): Any = unwrap(this).getS3Path()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFaqProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendra.CfnFaqProps): CfnFaqProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFaqProps): software.amazon.awscdk.services.kendra.CfnFaqProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.kendra.CfnFaqProps
  }
}
