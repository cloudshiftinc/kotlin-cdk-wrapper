@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ArnComponents {
  public fun account(): String? = unwrap(this).getAccount()

  public fun arnFormat(): ArnFormat? = unwrap(this).getArnFormat()?.let(ArnFormat::wrap)

  public fun partition(): String? = unwrap(this).getPartition()

  public fun region(): String? = unwrap(this).getRegion()

  public fun resource(): String

  public fun resourceName(): String? = unwrap(this).getResourceName()

  public fun service(): String

  @CdkDslMarker
  public interface Builder {
    public fun account(account: String)

    public fun arnFormat(arnFormat: ArnFormat)

    public fun partition(partition: String)

    public fun region(region: String)

    public fun resource(resource: String)

    public fun resourceName(resourceName: String)

    public fun service(service: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ArnComponents.Builder =
        software.amazon.awscdk.ArnComponents.builder()

    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    override fun arnFormat(arnFormat: ArnFormat) {
      cdkBuilder.arnFormat(arnFormat.let(ArnFormat::unwrap))
    }

    override fun partition(partition: String) {
      cdkBuilder.partition(partition)
    }

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun resource(resource: String) {
      cdkBuilder.resource(resource)
    }

    override fun resourceName(resourceName: String) {
      cdkBuilder.resourceName(resourceName)
    }

    override fun service(service: String) {
      cdkBuilder.service(service)
    }

    public fun build(): software.amazon.awscdk.ArnComponents = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.ArnComponents,
  ) : CdkObject(cdkObject), ArnComponents {
    override fun account(): String? = unwrap(this).getAccount()

    override fun arnFormat(): ArnFormat? = unwrap(this).getArnFormat()?.let(ArnFormat::wrap)

    override fun partition(): String? = unwrap(this).getPartition()

    override fun region(): String? = unwrap(this).getRegion()

    override fun resource(): String = unwrap(this).getResource()

    override fun resourceName(): String? = unwrap(this).getResourceName()

    override fun service(): String = unwrap(this).getService()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ArnComponents {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ArnComponents): ArnComponents =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArnComponents): software.amazon.awscdk.ArnComponents = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.ArnComponents
  }
}
