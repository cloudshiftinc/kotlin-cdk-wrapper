@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CustomResourceProps {
  public fun pascalCaseProperties(): Boolean? = unwrap(this).getPascalCaseProperties()

  public fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

  public fun removalPolicy(): RemovalPolicy? =
      unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

  public fun resourceType(): String? = unwrap(this).getResourceType()

  public fun serviceToken(): String

  @CdkDslMarker
  public interface Builder {
    public fun pascalCaseProperties(pascalCaseProperties: Boolean)

    public fun properties(properties: Map<String, Any>)

    public fun removalPolicy(removalPolicy: RemovalPolicy)

    public fun resourceType(resourceType: String)

    public fun serviceToken(serviceToken: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.CustomResourceProps.Builder =
        software.amazon.awscdk.CustomResourceProps.builder()

    override fun pascalCaseProperties(pascalCaseProperties: Boolean) {
      cdkBuilder.pascalCaseProperties(pascalCaseProperties)
    }

    override fun properties(properties: Map<String, Any>) {
      cdkBuilder.properties(properties)
    }

    override fun removalPolicy(removalPolicy: RemovalPolicy) {
      cdkBuilder.removalPolicy(removalPolicy.let(RemovalPolicy::unwrap))
    }

    override fun resourceType(resourceType: String) {
      cdkBuilder.resourceType(resourceType)
    }

    override fun serviceToken(serviceToken: String) {
      cdkBuilder.serviceToken(serviceToken)
    }

    public fun build(): software.amazon.awscdk.CustomResourceProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.CustomResourceProps,
  ) : CdkObject(cdkObject), CustomResourceProps {
    override fun pascalCaseProperties(): Boolean? = unwrap(this).getPascalCaseProperties()

    override fun properties(): Map<String, Any> = unwrap(this).getProperties() ?: emptyMap()

    override fun removalPolicy(): RemovalPolicy? =
        unwrap(this).getRemovalPolicy()?.let(RemovalPolicy::wrap)

    override fun resourceType(): String? = unwrap(this).getResourceType()

    override fun serviceToken(): String = unwrap(this).getServiceToken()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomResourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.CustomResourceProps): CustomResourceProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomResourceProps): software.amazon.awscdk.CustomResourceProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.CustomResourceProps
  }
}
