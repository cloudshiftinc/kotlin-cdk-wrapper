@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A managed prefix list.
 *
 * Example:
 *
 * ```
 * PrefixList.Builder.create(this, "EmptyPrefixList")
 * .maxEntries(100)
 * .build();
 * ```
 */
public open class PrefixList internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.PrefixList,
) : Resource(cdkObject), IPrefixList {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.PrefixList(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrefixListProps,
  ) :
      this(software.amazon.awscdk.services.ec2.PrefixList(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(PrefixListProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrefixListProps.Builder.() -> Unit,
  ) : this(scope, id, PrefixListProps(props)
  )

  /**
   * The address family of the prefix list.
   */
  public open fun addressFamily(): String = unwrap(this).getAddressFamily()

  /**
   * The owner ID of the prefix list.
   */
  public open fun ownerId(): String = unwrap(this).getOwnerId()

  /**
   * The ARN of the prefix list.
   */
  public open fun prefixListArn(): String = unwrap(this).getPrefixListArn()

  /**
   * The ID of the prefix list.
   */
  public override fun prefixListId(): String = unwrap(this).getPrefixListId()

  /**
   * The name of the prefix list.
   */
  public open fun prefixListName(): String = unwrap(this).getPrefixListName()

  /**
   * The version of the prefix list.
   */
  public open fun version(): Number = unwrap(this).getVersion()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.PrefixList].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The address family of the prefix list.
     *
     * Default: AddressFamily.IP_V4
     *
     * @param addressFamily The address family of the prefix list. 
     */
    public fun addressFamily(addressFamily: AddressFamily)

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     *
     * @param entries The list of entries for the prefix list. 
     */
    public fun entries(entries: List<CfnPrefixList.EntryProperty>)

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     *
     * @param entries The list of entries for the prefix list. 
     */
    public fun entries(vararg entries: CfnPrefixList.EntryProperty)

    /**
     * The maximum number of entries for the prefix list.
     *
     * Default: Automatically-calculated
     *
     * @param maxEntries The maximum number of entries for the prefix list. 
     */
    public fun maxEntries(maxEntries: Number)

    /**
     * The name of the prefix list.
     *
     * Default: None
     *
     * @param prefixListName The name of the prefix list. 
     */
    public fun prefixListName(prefixListName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrefixList.Builder =
        software.amazon.awscdk.services.ec2.PrefixList.Builder.create(scope, id)

    /**
     * The address family of the prefix list.
     *
     * Default: AddressFamily.IP_V4
     *
     * @param addressFamily The address family of the prefix list. 
     */
    override fun addressFamily(addressFamily: AddressFamily) {
      cdkBuilder.addressFamily(addressFamily.let(AddressFamily::unwrap))
    }

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     *
     * @param entries The list of entries for the prefix list. 
     */
    override fun entries(entries: List<CfnPrefixList.EntryProperty>) {
      cdkBuilder.entries(entries.map(CfnPrefixList.EntryProperty::unwrap))
    }

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     *
     * @param entries The list of entries for the prefix list. 
     */
    override fun entries(vararg entries: CfnPrefixList.EntryProperty): Unit =
        entries(entries.toList())

    /**
     * The maximum number of entries for the prefix list.
     *
     * Default: Automatically-calculated
     *
     * @param maxEntries The maximum number of entries for the prefix list. 
     */
    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    /**
     * The name of the prefix list.
     *
     * Default: None
     *
     * @param prefixListName The name of the prefix list. 
     */
    override fun prefixListName(prefixListName: String) {
      cdkBuilder.prefixListName(prefixListName)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrefixList = cdkBuilder.build()
  }

  public companion object {
    public fun fromPrefixListId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      prefixListId: String,
    ): IPrefixList =
        software.amazon.awscdk.services.ec2.PrefixList.fromPrefixListId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, prefixListId).let(IPrefixList::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrefixList {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrefixList(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrefixList): PrefixList =
        PrefixList(cdkObject)

    internal fun unwrap(wrapped: PrefixList): software.amazon.awscdk.services.ec2.PrefixList =
        wrapped.cdkObject
  }
}
