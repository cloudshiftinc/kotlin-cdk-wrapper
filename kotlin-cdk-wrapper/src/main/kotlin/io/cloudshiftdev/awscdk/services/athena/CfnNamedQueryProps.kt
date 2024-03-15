@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.athena

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnNamedQueryProps {
  public fun database(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun queryString(): String

  public fun workGroup(): String? = unwrap(this).getWorkGroup()

  @CdkDslMarker
  public interface Builder {
    public fun database(database: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun queryString(queryString: String)

    public fun workGroup(workGroup: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.athena.CfnNamedQueryProps.Builder =
        software.amazon.awscdk.services.athena.CfnNamedQueryProps.builder()

    override fun database(database: String) {
      cdkBuilder.database(database)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queryString(queryString: String) {
      cdkBuilder.queryString(queryString)
    }

    override fun workGroup(workGroup: String) {
      cdkBuilder.workGroup(workGroup)
    }

    public fun build(): software.amazon.awscdk.services.athena.CfnNamedQueryProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.athena.CfnNamedQueryProps,
  ) : CdkObject(cdkObject), CfnNamedQueryProps {
    override fun database(): String = unwrap(this).getDatabase()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun queryString(): String = unwrap(this).getQueryString()

    override fun workGroup(): String? = unwrap(this).getWorkGroup()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnNamedQueryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.athena.CfnNamedQueryProps):
        CfnNamedQueryProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnNamedQueryProps):
        software.amazon.awscdk.services.athena.CfnNamedQueryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.athena.CfnNamedQueryProps
  }
}
