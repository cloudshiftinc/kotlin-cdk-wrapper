@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AwsDestination {
  public fun assumeRoleAdditionalOptions(): Map<String, Any> =
      unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

  public fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

  public fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

  public fun region(): String? = unwrap(this).getRegion()

  @CdkDslMarker
  public interface Builder {
    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun assumeRoleArn(assumeRoleArn: String)

    public fun assumeRoleExternalId(assumeRoleExternalId: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.AwsDestination.Builder =
        software.amazon.awscdk.cloudassembly.schema.AwsDestination.builder()

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun assumeRoleArn(assumeRoleArn: String) {
      cdkBuilder.assumeRoleArn(assumeRoleArn)
    }

    override fun assumeRoleExternalId(assumeRoleExternalId: String) {
      cdkBuilder.assumeRoleExternalId(assumeRoleExternalId)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.AwsDestination =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsDestination,
  ) : CdkObject(cdkObject),
      AwsDestination {
    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun assumeRoleArn(): String? = unwrap(this).getAssumeRoleArn()

    override fun assumeRoleExternalId(): String? = unwrap(this).getAssumeRoleExternalId()

    override fun region(): String? = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AwsDestination {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.AwsDestination):
        AwsDestination = CdkObjectWrappers.wrap(cdkObject) as? AwsDestination ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AwsDestination):
        software.amazon.awscdk.cloudassembly.schema.AwsDestination = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.AwsDestination
  }
}
