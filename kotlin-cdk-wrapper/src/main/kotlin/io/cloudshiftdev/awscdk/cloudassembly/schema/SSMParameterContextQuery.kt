@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface SSMParameterContextQuery : ContextLookupRoleOptions {
  public fun parameterName(): String

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    public fun parameterName(parameterName: String)

    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    override fun parameterName(parameterName: String) {
      cdkBuilder.parameterName(parameterName)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery,
  ) : CdkObject(cdkObject),
      SSMParameterContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    override fun parameterName(): String = unwrap(this).getParameterName()

    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SSMParameterContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery):
        SSMParameterContextQuery = CdkObjectWrappers.wrap(cdkObject) as? SSMParameterContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SSMParameterContextQuery):
        software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery
  }
}
