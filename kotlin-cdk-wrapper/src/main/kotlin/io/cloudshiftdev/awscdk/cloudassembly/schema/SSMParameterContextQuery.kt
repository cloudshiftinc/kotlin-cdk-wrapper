@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SSMParameterContextQuery {
  public fun account(): String

  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  public fun parameterName(): String

  public fun region(): String

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun lookupRoleArn(lookupRoleArn: String)

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

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
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
    override val cdkObject: software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery,
  ) : CdkObject(cdkObject), SSMParameterContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

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
        SSMParameterContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SSMParameterContextQuery):
        software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.SSMParameterContextQuery
  }
}
