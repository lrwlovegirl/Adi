package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Itemtre;

public interface IItemtreDAO {
	/**
	 * ����������������
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public boolean doCreateItemtre(Itemtre vo) throws Exception;
	/**
	 * ���������˵���ɾ��
	 * @param irid �������������˵��ı��
	 * @return
	 * @throws Exception
	 */
	public boolean doRemoveItemtre(int irid) throws Exception;
	/**
	 * ���������˵��ĸ���
	 * @param vo ������irid,itid,title
	 * @return
	 * @throws Exception
	 */
	public boolean updateItemtre(Itemtre vo) throws Exception;
	/**
	 * ��ѯ�����е������˵�
	 * @return
	 * @throws Exception
	 */
	public List<Itemtre> findAllItemtre() throws Exception;
	/**
	 * ���ݱ�Ų�ѯ��ĳ�����������˵�
	 * @param irid
	 * @return
	 * @throws Exception
	 */
	public Itemtre findItemtreByIrid(int irid) throws Exception;
	/**
	 * ������������ı�Ų�ѯ�����ж�Ӧ����������
	 * @param itid
	 * @return
	 * @throws Exception
	 */
	public List<Itemtre> findItemtreByItid(int itid) throws Exception;
}
