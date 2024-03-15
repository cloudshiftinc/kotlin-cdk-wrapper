@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3outposts

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBucketProps {
  public fun bucketName(): String

  public fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

  public fun outpostId(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun lifecycleConfiguration(lifecycleConfiguration: IResolvable)

    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4f545cb10cb2f65ce997bc739e93d310721197aded2714f4ee46ed8da25f1c")
    public
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit)

    public fun outpostId(outpostId: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3outposts.CfnBucketProps.Builder =
        software.amazon.awscdk.services.s3outposts.CfnBucketProps.builder()

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun lifecycleConfiguration(lifecycleConfiguration: IResolvable) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(IResolvable::unwrap))
    }

    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty) {
      cdkBuilder.lifecycleConfiguration(lifecycleConfiguration.let(CfnBucket.LifecycleConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fe4f545cb10cb2f65ce997bc739e93d310721197aded2714f4ee46ed8da25f1c")
    override
        fun lifecycleConfiguration(lifecycleConfiguration: CfnBucket.LifecycleConfigurationProperty.Builder.() -> Unit):
        Unit =
        lifecycleConfiguration(CfnBucket.LifecycleConfigurationProperty(lifecycleConfiguration))

    override fun outpostId(outpostId: String) {
      cdkBuilder.outpostId(outpostId)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.s3outposts.CfnBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketProps,
  ) : CdkObject(cdkObject), CfnBucketProps {
    override fun bucketName(): String = unwrap(this).getBucketName()

    override fun lifecycleConfiguration(): Any? = unwrap(this).getLifecycleConfiguration()

    override fun outpostId(): String = unwrap(this).getOutpostId()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3outposts.CfnBucketProps):
        CfnBucketProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBucketProps):
        software.amazon.awscdk.services.s3outposts.CfnBucketProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.s3outposts.CfnBucketProps
  }
}
