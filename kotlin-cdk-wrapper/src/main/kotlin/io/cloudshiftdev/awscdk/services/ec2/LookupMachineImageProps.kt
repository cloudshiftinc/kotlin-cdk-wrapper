@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LookupMachineImageProps {
  public fun filters(): Map<String, List<String>> = unwrap(this).getFilters() ?: emptyMap()

  public fun name(): String

  public fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

  public fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

  public fun windows(): Boolean? = unwrap(this).getWindows()

  @CdkDslMarker
  public interface Builder {
    public fun filters(filters: Map<String, List<String>>)

    public fun name(name: String)

    public fun owners(owners: List<String>)

    public fun owners(vararg owners: String)

    public fun userData(userData: UserData)

    public fun windows(windows: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LookupMachineImageProps.Builder =
        software.amazon.awscdk.services.ec2.LookupMachineImageProps.builder()

    override fun filters(filters: Map<String, List<String>>) {
      cdkBuilder.filters(filters)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun owners(owners: List<String>) {
      cdkBuilder.owners(owners)
    }

    override fun owners(vararg owners: String): Unit = owners(owners.toList())

    override fun userData(userData: UserData) {
      cdkBuilder.userData(userData.let(UserData::unwrap))
    }

    override fun windows(windows: Boolean) {
      cdkBuilder.windows(windows)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LookupMachineImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImageProps,
  ) : CdkObject(cdkObject), LookupMachineImageProps {
    override fun filters(): Map<String, List<String>> = unwrap(this).getFilters() ?: emptyMap()

    override fun name(): String = unwrap(this).getName()

    override fun owners(): List<String> = unwrap(this).getOwners() ?: emptyList()

    override fun userData(): UserData? = unwrap(this).getUserData()?.let(UserData::wrap)

    override fun windows(): Boolean? = unwrap(this).getWindows()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LookupMachineImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LookupMachineImageProps):
        LookupMachineImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LookupMachineImageProps):
        software.amazon.awscdk.services.ec2.LookupMachineImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.LookupMachineImageProps
  }
}
