package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ec2.AclIcmp,
  ) : AclIcmp {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AclIcmp {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.AclIcmp): AclIcmp =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AclIcmp): software.amazon.awscdk.services.ec2.AclIcmp = (wrapped as
        Wrapper).cdkObject
  }
}
