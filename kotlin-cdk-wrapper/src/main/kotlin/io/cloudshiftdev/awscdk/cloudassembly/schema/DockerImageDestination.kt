@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface DockerImageDestination : AwsDestination {
  public fun imageTag(): String

  public fun repositoryName(): String

  @CdkDslMarker
  public interface Builder {
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun assumeRoleArn(assumeRoleArn: String)

    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    public fun imageTag(imageTag: String)

    public fun region(region: String)

    public fun repositoryName(repositoryName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.DockerImageDestination.Builder =
        software.amazon.awscdk.cloudassembly.schema.DockerImageDestination.builder()

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    override fun imageTag(imageTag: String) {
      cdkBuilder.imageTag(imageTag)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.DockerImageDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageDestination,
  ) : CdkObject(cdkObject),
      DockerImageDestination {
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    override fun imageTag(): String = unwrap(this).getImageTag()

    override fun region(): String? = unwrap(this).getRegion()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DockerImageDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.DockerImageDestination):
        DockerImageDestination = CdkObjectWrappers.wrap(cdkObject) as? DockerImageDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerImageDestination):
        software.amazon.awscdk.cloudassembly.schema.DockerImageDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.DockerImageDestination
  }
}
