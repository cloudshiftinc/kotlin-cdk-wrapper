@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties that describe an existing instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.docdb.*;
 * DatabaseInstanceAttributes databaseInstanceAttributes = DatabaseInstanceAttributes.builder()
 * .instanceEndpointAddress("instanceEndpointAddress")
 * .instanceIdentifier("instanceIdentifier")
 * .port(123)
 * .build();
 * ```
 */
public interface DatabaseInstanceAttributes {
  /**
   * The endpoint address.
   */
  public fun instanceEndpointAddress(): String

  /**
   * The instance identifier.
   */
  public fun instanceIdentifier(): String

  /**
   * The database port.
   */
  public fun port(): Number

  /**
   * A builder for [DatabaseInstanceAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceEndpointAddress The endpoint address. 
     */
    public fun instanceEndpointAddress(instanceEndpointAddress: String)

    /**
     * @param instanceIdentifier The instance identifier. 
     */
    public fun instanceIdentifier(instanceIdentifier: String)

    /**
     * @param port The database port. 
     */
    public fun port(port: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes.Builder
        = software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes.builder()

    /**
     * @param instanceEndpointAddress The endpoint address. 
     */
    override fun instanceEndpointAddress(instanceEndpointAddress: String) {
      cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
    }

    /**
     * @param instanceIdentifier The instance identifier. 
     */
    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    /**
     * @param port The database port. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes,
  ) : CdkObject(cdkObject), DatabaseInstanceAttributes {
    /**
     * The endpoint address.
     */
    override fun instanceEndpointAddress(): String = unwrap(this).getInstanceEndpointAddress()

    /**
     * The instance identifier.
     */
    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()

    /**
     * The database port.
     */
    override fun port(): Number = unwrap(this).getPort()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInstanceAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes):
        DatabaseInstanceAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        DatabaseInstanceAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceAttributes):
        software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.DatabaseInstanceAttributes
  }
}
