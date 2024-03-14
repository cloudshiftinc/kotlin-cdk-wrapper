package io.cloudshiftdev.awscdk.cloudassembly.schema

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface KeyContextQuery {
  /**
   * Query account.
   */
  public fun account(): String

  /**
   * Alias name used to search the Key.
   */
  public fun aliasName(): String

  /**
   * The ARN of the role that should be used to look up the missing values.
   *
   * Default: - None
   */
  public fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

  /**
   * Query region.
   */
  public fun region(): String

  /**
   * A builder for [KeyContextQuery]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param account Query account. 
     */
    public fun account(account: String)

    /**
     * @param aliasName Alias name used to search the Key. 
     */
    public fun aliasName(aliasName: String)

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    public fun lookupRoleArn(lookupRoleArn: String)

    /**
     * @param region Query region. 
     */
    public fun region(region: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.cloudassembly.schema.KeyContextQuery.Builder =
        software.amazon.awscdk.cloudassembly.schema.KeyContextQuery.builder()

    /**
     * @param account Query account. 
     */
    override fun account(account: String) {
      cdkBuilder.account(account)
    }

    /**
     * @param aliasName Alias name used to search the Key. 
     */
    override fun aliasName(aliasName: String) {
      cdkBuilder.aliasName(aliasName)
    }

    /**
     * @param lookupRoleArn The ARN of the role that should be used to look up the missing values.
     */
    override fun lookupRoleArn(lookupRoleArn: String) {
      cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    /**
     * @param region Query region. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public fun build(): software.amazon.awscdk.cloudassembly.schema.KeyContextQuery =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.cloudassembly.schema.KeyContextQuery,
  ) : KeyContextQuery {
    /**
     * Query account.
     */
    override fun account(): String = unwrap(this).getAccount()

    /**
     * Alias name used to search the Key.
     */
    override fun aliasName(): String = unwrap(this).getAliasName()

    /**
     * The ARN of the role that should be used to look up the missing values.
     *
     * Default: - None
     */
    override fun lookupRoleArn(): String? = unwrap(this).getLookupRoleArn()

    /**
     * Query region.
     */
    override fun region(): String = unwrap(this).getRegion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): KeyContextQuery {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.cloudassembly.schema.KeyContextQuery):
        KeyContextQuery = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyContextQuery):
        software.amazon.awscdk.cloudassembly.schema.KeyContextQuery = (wrapped as Wrapper).cdkObject
  }
}
