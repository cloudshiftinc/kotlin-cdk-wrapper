@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Properties to create Icmp.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * AclIcmp aclIcmp = AclIcmp.builder()
 * .code(123)
 * .type(123)
 * .build();
 * ```
 */
public interface AclIcmp {
  /**
   * The Internet Control Message Protocol (ICMP) code.
   *
   * You can use -1 to specify all ICMP
   * codes for the given ICMP type. Requirement is conditional: Required if you
   * specify 1 (ICMP) for the protocol parameter.
   */
  public fun code(): Number? = unwrap(this).getCode()

  /**
   * The Internet Control Message Protocol (ICMP) type.
   *
   * You can use -1 to specify all ICMP types.
   * Conditional requirement: Required if you specify 1 (ICMP) for the CreateNetworkAclEntry
   * protocol parameter.
   */
  public fun type(): Number? = unwrap(this).getType()

  /**
   * A builder for [AclIcmp]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param code The Internet Control Message Protocol (ICMP) code.
     * You can use -1 to specify all ICMP
     * codes for the given ICMP type. Requirement is conditional: Required if you
     * specify 1 (ICMP) for the protocol parameter.
     */
    public fun code(code: Number)

    /**
     * @param type The Internet Control Message Protocol (ICMP) type.
     * You can use -1 to specify all ICMP types.
     * Conditional requirement: Required if you specify 1 (ICMP) for the CreateNetworkAclEntry
     * protocol parameter.
     */
    public fun type(type: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.AclIcmp.Builder =
        software.amazon.awscdk.services.ec2.AclIcmp.builder()

    /**
     * @param code The Internet Control Message Protocol (ICMP) code.
     * You can use -1 to specify all ICMP
     * codes for the given ICMP type. Requirement is conditional: Required if you
     * specify 1 (ICMP) for the protocol parameter.
     */
    override fun code(code: Number) {
      cdkBuilder.code(code)
    }

    /**
     * @param type The Internet Control Message Protocol (ICMP) type.
     * You can use -1 to specify all ICMP types.
     * Conditional requirement: Required if you specify 1 (ICMP) for the CreateNetworkAclEntry
     * protocol parameter.
     */
    override fun type(type: Number) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.ec2.AclIcmp = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.AclIcmp,
  ) : CdkObject(cdkObject), AclIcmp {
    /**
     * The Internet Control Message Protocol (ICMP) code.
     *
     * You can use -1 to specify all ICMP
     * codes for the given ICMP type. Requirement is conditional: Required if you
     * specify 1 (ICMP) for the protocol parameter.
     */
    override fun code(): Number? = unwrap(this).getCode()

    /**
     * The Internet Control Message Protocol (ICMP) type.
     *
     * You can use -1 to specify all ICMP types.
     * Conditional requirement: Required if you specify 1 (ICMP) for the CreateNetworkAclEntry
     * protocol parameter.
     */
    override fun type(): Number? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AclIcmp {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclIcmp): AclIcmp =
        CdkObjectWrappers.wrap(cdkObject) as AclIcmp

    internal fun unwrap(wrapped: AclIcmp): software.amazon.awscdk.services.ec2.AclIcmp = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.AclIcmp
  }
}
