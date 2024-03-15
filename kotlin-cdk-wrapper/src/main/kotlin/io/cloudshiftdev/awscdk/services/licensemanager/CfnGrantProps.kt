@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.licensemanager

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnGrantProps {
  public fun allowedOperations(): List<String> = unwrap(this).getAllowedOperations() ?: emptyList()

  public fun grantName(): String? = unwrap(this).getGrantName()

  public fun homeRegion(): String? = unwrap(this).getHomeRegion()

  public fun licenseArn(): String? = unwrap(this).getLicenseArn()

  public fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

  public fun status(): String? = unwrap(this).getStatus()

  @CdkDslMarker
  public interface Builder {
    public fun allowedOperations(allowedOperations: List<String>)

    public fun allowedOperations(vararg allowedOperations: String)

    public fun grantName(grantName: String)

    public fun homeRegion(homeRegion: String)

    public fun licenseArn(licenseArn: String)

    public fun principals(principals: List<String>)

    public fun principals(vararg principals: String)

    public fun status(status: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.licensemanager.CfnGrantProps.Builder =
        software.amazon.awscdk.services.licensemanager.CfnGrantProps.builder()

    override fun allowedOperations(allowedOperations: List<String>) {
      cdkBuilder.allowedOperations(allowedOperations)
    }

    override fun allowedOperations(vararg allowedOperations: String): Unit =
        allowedOperations(allowedOperations.toList())

    override fun grantName(grantName: String) {
      cdkBuilder.grantName(grantName)
    }

    override fun homeRegion(homeRegion: String) {
      cdkBuilder.homeRegion(homeRegion)
    }

    override fun licenseArn(licenseArn: String) {
      cdkBuilder.licenseArn(licenseArn)
    }

    override fun principals(principals: List<String>) {
      cdkBuilder.principals(principals)
    }

    override fun principals(vararg principals: String): Unit = principals(principals.toList())

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    public fun build(): software.amazon.awscdk.services.licensemanager.CfnGrantProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrantProps,
  ) : CdkObject(cdkObject), CfnGrantProps {
    override fun allowedOperations(): List<String> = unwrap(this).getAllowedOperations() ?:
        emptyList()

    override fun grantName(): String? = unwrap(this).getGrantName()

    override fun homeRegion(): String? = unwrap(this).getHomeRegion()

    override fun licenseArn(): String? = unwrap(this).getLicenseArn()

    override fun principals(): List<String> = unwrap(this).getPrincipals() ?: emptyList()

    override fun status(): String? = unwrap(this).getStatus()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGrantProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.licensemanager.CfnGrantProps):
        CfnGrantProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGrantProps):
        software.amazon.awscdk.services.licensemanager.CfnGrantProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.licensemanager.CfnGrantProps
  }
}
