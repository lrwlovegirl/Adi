package com.lrw.dao;

import java.util.List;

import com.lrw.vo.Itemone;
import com.lrw.vo.Itemtwo;

public interface IItemtwoDAO {
	/**
	 * ���ж�����������
	 * @param vo
	 * @return
	 * @throws Exception
	 */
	public boolean doCreateItemtwo(Itemtwo vo) throws Exception;
	/**
	 * ���ж����˵���ɾ��
	 * @param ioid ��������һ���˵��ı��
	 * @return
	 * @throws Exception
	 */
	public boolean doRemoveItemtwo(int itid) throws Exception;
	/**
	 * ���ж����˵��ĸ���
	 * @param vo ����ioid �� title
	 * @return
	 * @throws Exception
	 */
	public boolean updateItemtwo(Itemtwo vo) throws Exception;
	/**
	 * ��ѯ�����еĶ����˵�
	 * @return
	 * @throws Exception
	 */
	public List<Itemtwo> findAllItemtwo() throws Exception;
	/**
	 * ���ݱ�Ų�ѯ��ĳ����������˵�
	 * @param ioid
	 * @return
	 * @throws Exception
	 */
	public Itemtwo findItemtwoByItid(int itid) throws Exception;
	/**
	 * ����һ������ı�Ų�ѯ�����ж�Ӧ�Ķ�������
	 * @param ioid
	 * @return
	 * @throws Exception
	 */
	public List<Itemtwo> findItemtwoByIoid(int ioid) throws Exception;
}
