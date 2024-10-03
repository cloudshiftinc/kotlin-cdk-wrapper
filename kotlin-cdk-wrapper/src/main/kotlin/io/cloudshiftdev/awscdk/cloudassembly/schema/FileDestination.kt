@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface FileDestination : AwsDestination {
  public fun bucketName(): String

  public fun objectKey(): String

  @CdkDslMarker
  public interface Builder {
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun assumeRoleArn(assumeRoleArn: String)

    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    public fun bucketName(bucketName: String)

    public fun objectKey(objectKey: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.FileDestination.Builder =
        software.amazon.awscdk.cloudassembly.schema.FileDestination.builder()

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.FileDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.FileDestination,
  ) : CdkObject(cdkObject),
      FileDestination {
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    override fun bucketName(): String = unwrap(this).getBucketName()

    override fun objectKey(): String = unwrap(this).getObjectKey()

    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FileDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.FileDestination):
        FileDestination = CdkObjectWrappers.wrap(cdkObject) as? FileDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FileDestination):
        software.amazon.awscdk.cloudassembly.schema.FileDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.FileDestination
  }
}
