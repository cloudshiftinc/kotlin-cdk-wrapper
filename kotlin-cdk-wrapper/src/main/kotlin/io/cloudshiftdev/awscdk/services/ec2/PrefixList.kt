@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A managed prefix list.
 *
 * Example:
 *
 * ```
 * PrefixList.fromLookup(this, "PrefixListFromName", PrefixListLookupOptions.builder()
 * .prefixListName("com.amazonaws.global.cloudfront.origin-facing")
 * .build());
 * ```
 */
public open class PrefixList(
  cdkObject: software.amazon.awscdk.services.ec2.PrefixList,
) : Resource(cdkObject),
    IPrefixList {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ec2.PrefixList(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrefixListProps,
  ) :
      this(software.amazon.awscdk.services.ec2.PrefixList(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(PrefixListProps.Companion::unwrap))
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
   * Whether the rule can be inlined into a SecurityGroup or not.
   */
  public override fun canInlineRule(): Boolean = unwrap(this).getCanInlineRule()

  /**
   * The network connections associated with this resource.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

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
   * Produce the egress rule JSON for the given connection.
   */
  public override fun toEgressRuleConfig(): Any = unwrap(this).toEgressRuleConfig()

  /**
   * Produce the ingress rule JSON for the given connection.
   */
  public override fun toIngressRuleConfig(): Any = unwrap(this).toIngressRuleConfig()

  /**
   * A unique identifier for this connection peer.
   */
  public override fun uniqueId(): String = unwrap(this).getUniqueId()

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
      cdkBuilder.addressFamily(addressFamily.let(AddressFamily.Companion::unwrap))
    }

    /**
     * The list of entries for the prefix list.
     *
     * Default: []
     *
     * @param entries The list of entries for the prefix list. 
     */
    override fun entries(entries: List<CfnPrefixList.EntryProperty>) {
      cdkBuilder.entries(entries.map(CfnPrefixList.EntryProperty.Companion::unwrap))
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
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.ec2.PrefixList.PROPERTY_INJECTION_ID

    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: PrefixListLookupOptions,
    ): IPrefixList =
        software.amazon.awscdk.services.ec2.PrefixList.fromLookup(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, options.let(PrefixListLookupOptions.Companion::unwrap)).let(IPrefixList::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3765b91bd01f2a1bb2331d0dc1a3db5b907e7f2dce77b8556c09660131785dd1")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: PrefixListLookupOptions.Builder.() -> Unit,
    ): IPrefixList = fromLookup(scope, id, PrefixListLookupOptions(options))

    public fun fromPrefixListId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      prefixListId: String,
    ): IPrefixList =
        software.amazon.awscdk.services.ec2.PrefixList.fromPrefixListId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
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
        wrapped.cdkObject as software.amazon.awscdk.services.ec2.PrefixList
  }
}
