@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for looking up an existing DatabaseInstance.
 *
 * Example:
 *
 * ```
 * Role myUserRole;
 * IDatabaseInstance dbFromLookup = DatabaseInstance.fromLookup(this, "dbFromLookup",
 * DatabaseInstanceLookupOptions.builder()
 * .instanceIdentifier("instanceId")
 * .build());
 * // Grant a connection
 * dbFromLookup.grantConnect(myUserRole, "my-user-id");
 * ```
 */
public interface DatabaseInstanceLookupOptions {
  /**
   * The instance identifier of the DatabaseInstance.
   */
  public fun instanceIdentifier(): String

  /**
   * A builder for [DatabaseInstanceLookupOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param instanceIdentifier The instance identifier of the DatabaseInstance. 
     */
    public fun instanceIdentifier(instanceIdentifier: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions.Builder =
        software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions.builder()

    /**
     * @param instanceIdentifier The instance identifier of the DatabaseInstance. 
     */
    override fun instanceIdentifier(instanceIdentifier: String) {
      cdkBuilder.instanceIdentifier(instanceIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions,
  ) : CdkObject(cdkObject),
      DatabaseInstanceLookupOptions {
    /**
     * The instance identifier of the DatabaseInstance.
     */
    override fun instanceIdentifier(): String = unwrap(this).getInstanceIdentifier()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInstanceLookupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions):
        DatabaseInstanceLookupOptions = CdkObjectWrappers.wrap(cdkObject) as?
        DatabaseInstanceLookupOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseInstanceLookupOptions):
        software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.DatabaseInstanceLookupOptions
  }
}
