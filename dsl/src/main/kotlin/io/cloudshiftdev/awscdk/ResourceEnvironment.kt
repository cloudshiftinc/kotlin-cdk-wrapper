package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ResourceEnvironment {
  /**
   * The AWS account ID that this resource belongs to.
   *
   * Since this can be a Token
   * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
   * make sure to use Token.compareStrings()
   * instead of just comparing the values for equality.
   */
  public fun account(): String

  /**
   * The AWS region that this resource belongs to.
   *
   * Since this can be a Token
   * (for example, when the region is CloudFormation's AWS::Region intrinsic),
   * make sure to use Token.compareStrings()
   * instead of just comparing the values for equality.
   */
  public fun region(): String

  /**
   * A builder for [ResourceEnvironment]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account The AWS account ID that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    public fun account(account: String)

    /**
     * @param region The AWS region that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the region is CloudFormation's AWS::Region intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.ResourceEnvironment.Builder =
        software.amazon.awscdk.ResourceEnvironment.builder()

    /**
     * @param account The AWS account ID that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param region The AWS region that this resource belongs to. 
     * Since this can be a Token
     * (for example, when the region is CloudFormation's AWS::Region intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.ResourceEnvironment = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ResourceEnvironment,
  ) : ResourceEnvironment {
    /**
     * The AWS account ID that this resource belongs to.
     *
     * Since this can be a Token
     * (for example, when the account is CloudFormation's AWS::AccountId intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * The AWS region that this resource belongs to.
     *
     * Since this can be a Token
     * (for example, when the region is CloudFormation's AWS::Region intrinsic),
     * make sure to use Token.compareStrings()
     * instead of just comparing the values for equality.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ResourceEnvironment {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ResourceEnvironment): ResourceEnvironment =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ResourceEnvironment): software.amazon.awscdk.ResourceEnvironment =
        (wrapped as Wrapper).cdkObject
  }
}
