@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CcApiContextQuery : ContextLookupRoleOptions {
  public fun dummyValue(): Any? = unwrap(this).getDummyValue()

  public fun exactIdentifier(): String? = unwrap(this).getExactIdentifier()

  public fun expectedMatchCount(): String? = unwrap(this).getExpectedMatchCount()

  public fun ignoreErrorOnMissingContext(): Boolean? = unwrap(this).getIgnoreErrorOnMissingContext()

  public fun propertiesToReturn(): List<String>

  public fun propertyMatch(): Map<String, Any> = unwrap(this).getPropertyMatch() ?: emptyMap()

  public fun typeName(): String

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>)

    public fun dummyValue(dummyValue: Any)

    public fun exactIdentifier(exactIdentifier: String)

    public fun expectedMatchCount(expectedMatchCount: String)

    public fun ignoreErrorOnMissingContext(ignoreErrorOnMissingContext: Boolean)

    public fun lookupRoleArn(lookupRoleArn: String)

    public fun lookupRoleExternalId(lookupRoleExternalId: String)

    public fun propertiesToReturn(propertiesToReturn: List<String>)

    public fun propertiesToReturn(vararg propertiesToReturn: String)

    public fun propertyMatch(propertyMatch: Map<String, Any>)

    public fun region(region: String)

    public fun typeName(typeName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.CcApiContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.CcApiContextQuery.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun assumeRoleAdditionalOptions(assumeRoleAdditionalOptions: Map<String, Any>) {
      cdkBuilder.assumeRoleAdditionalOptions(assumeRoleAdditionalOptions.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun dummyValue(dummyValue: Any) {
      cdkBuilder.dummyValue(dummyValue)
    }

    override fun exactIdentifier(exactIdentifier: String) {
      cdkBuilder.exactIdentifier(exactIdentifier)
    }

    override fun expectedMatchCount(expectedMatchCount: String) {
      cdkBuilder.expectedMatchCount(expectedMatchCount)
    }

    override fun ignoreErrorOnMissingContext(ignoreErrorOnMissingContext: Boolean) {
      cdkBuilder.ignoreErrorOnMissingContext(ignoreErrorOnMissingContext)
    }

    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    override fun lookupRoleExternalId(lookupRoleExternalId: String) {
      cdkBuilder.lookupRoleExternalId(lookupRoleExternalId)
    }

    override fun propertiesToReturn(propertiesToReturn: List<String>) {
      cdkBuilder.propertiesToReturn(propertiesToReturn)
    }

    override fun propertiesToReturn(vararg propertiesToReturn: String): Unit =
        propertiesToReturn(propertiesToReturn.toList())

    override fun propertyMatch(propertyMatch: Map<String, Any>) {
      cdkBuilder.propertyMatch(propertyMatch.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun typeName(typeName: String) {
      cdkBuilder.typeName(typeName)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.CcApiContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.cloudassembly.schema.CcApiContextQuery,
  ) : CdkObject(cdkObject),
      CcApiContextQuery {
    override fun account(): String = unwrap(this).getAccount()

    override fun assumeRoleAdditionalOptions(): Map<String, Any> =
        unwrap(this).getAssumeRoleAdditionalOptions() ?: emptyMap()

    override fun dummyValue(): Any? = unwrap(this).getDummyValue()

    override fun exactIdentifier(): String? = unwrap(this).getExactIdentifier()

    override fun expectedMatchCount(): String? = unwrap(this).getExpectedMatchCount()

    override fun ignoreErrorOnMissingContext(): Boolean? =
        unwrap(this).getIgnoreErrorOnMissingContext()

    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    override fun lookupRoleExternalId(): String? = unwrap(this).getLookupRoleExternalId()

    override fun propertiesToReturn(): List<String> = unwrap(this).getPropertiesToReturn()

    override fun propertyMatch(): Map<String, Any> = unwrap(this).getPropertyMatch() ?: emptyMap()

    override fun region(): String = unwrap(this).getRegion()

    override fun typeName(): String = unwrap(this).getTypeName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CcApiContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.CcApiContextQuery):
        CcApiContextQuery = CdkObjectWrappers.wrap(cdkObject) as? CcApiContextQuery ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CcApiContextQuery):
        software.amazon.awscdk.cloudassembly.schema.CcApiContextQuery = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.cloudassembly.schema.CcApiContextQuery
  }
}
